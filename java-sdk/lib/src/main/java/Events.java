package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Events {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Events(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getEvents - List user and enterprise events
     *
     * Returns up to a year of past events for a given user
     * or for the entire enterprise.
     * 
     * By default this returns events for the authenticated user. To retrieve events
     * for the entire enterprise, set the `stream_type` to `admin_logs_streaming`
     * for live monitoring of new events, or `admin_logs` for querying across
     * historical events. The user making the API call will
     * need to have admin privileges, and the application will need to have the
     * scope `manage enterprise properties` checked.
    **/
    public .models.operations.GetEventsResponse getEvents(.models.operations.GetEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/events");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetEventsResponse res = new .models.operations.GetEventsResponse() {{
            events = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.Events out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Events.class);
                res.events = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
	
    /**
     * optionsEvents - Get events long poll endpoint
     *
     * Returns a list of real-time servers that can be used for long-polling updates
     * to the [event stream](#get-events).
     * 
     * Long polling is the concept where a HTTP request is kept open until the
     * server sends a response, then repeating the process over and over to receive
     * updated responses.
     * 
     * Long polling the event stream can only be used for user events, not for
     * enterprise events.
     * 
     * To use long polling, first use this endpoint to retrieve a list of long poll
     * URLs. Next, make a long poll request to any of the provided URLs.
     * 
     * When an event occurs in monitored account a response with the value
     * `new_change` will be sent. The response contains no other details as
     * it only serves as a prompt to take further action such as sending a
     * request to the [events endpoint](#get-events) with the last known
     * `stream_position`.
     * 
     * After the server sends this response it closes the connection. You must now
     * repeat the long poll process to begin listening for events again.
     * 
     * If no events occur for a while and the connection times out you will
     * receive a response with the value `reconnect`. When you receive this response
     * you’ll make another call to this endpoint to restart the process.
     * 
     * If you receive no events in `retry_timeout` seconds then you will need to
     * make another request to the real-time server (one of the URLs in the response
     * for this endpoint). This might be necessary due to network errors.
     * 
     * Finally, if you receive a `max_retries` error when making a request to the
     * real-time server, you should start over by making a call to this endpoint
     * first.
    **/
    public .models.operations.OptionsEventsResponse optionsEvents(.models.operations.OptionsEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/events");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("OPTIONS");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.OptionsEventsResponse res = new .models.operations.OptionsEventsResponse() {{
            realtimeServers = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RealtimeServers out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RealtimeServers.class);
                res.realtimeServers = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }

        return res;
    }
	
}