import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class Events:
    _client: requests.Session
    _security_client: requests.Session
    _server_url: str
    _language: str
    _sdk_version: str
    _gen_version: str

    def __init__(self, client: requests.Session, security_client: requests.Session, server_url: str, language: str, sdk_version: str, gen_version: str) -> None:
        self._client = client
        self._security_client = security_client
        self._server_url = server_url
        self._language = language
        self._sdk_version = sdk_version
        self._gen_version = gen_version

    
    def get_events(self, request: operations.GetEventsRequest) -> operations.GetEventsResponse:
        r"""List user and enterprise events
        Returns up to a year of past events for a given user
        or for the entire enterprise.
        
        By default this returns events for the authenticated user. To retrieve events
        for the entire enterprise, set the `stream_type` to `admin_logs_streaming`
        for live monitoring of new events, or `admin_logs` for querying across
        historical events. The user making the API call will
        need to have admin privileges, and the application will need to have the
        scope `manage enterprise properties` checked.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/events"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("GET", url, params=query_params)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.GetEventsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Events])
                res.events = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def options_events(self, request: operations.OptionsEventsRequest) -> operations.OptionsEventsResponse:
        r"""Get events long poll endpoint
        Returns a list of real-time servers that can be used for long-polling updates
        to the [event stream](#get-events).
        
        Long polling is the concept where a HTTP request is kept open until the
        server sends a response, then repeating the process over and over to receive
        updated responses.
        
        Long polling the event stream can only be used for user events, not for
        enterprise events.
        
        To use long polling, first use this endpoint to retrieve a list of long poll
        URLs. Next, make a long poll request to any of the provided URLs.
        
        When an event occurs in monitored account a response with the value
        `new_change` will be sent. The response contains no other details as
        it only serves as a prompt to take further action such as sending a
        request to the [events endpoint](#get-events) with the last known
        `stream_position`.
        
        After the server sends this response it closes the connection. You must now
        repeat the long poll process to begin listening for events again.
        
        If no events occur for a while and the connection times out you will
        receive a response with the value `reconnect`. When you receive this response
        you’ll make another call to this endpoint to restart the process.
        
        If you receive no events in `retry_timeout` seconds then you will need to
        make another request to the real-time server (one of the URLs in the response
        for this endpoint). This might be necessary due to network errors.
        
        Finally, if you receive a `max_retries` error when making a request to the
        real-time server, you should start over by making a call to this endpoint
        first.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/events"
        
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("OPTIONS", url)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.OptionsEventsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.RealtimeServers])
                res.realtime_servers = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    