package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Authorization {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Authorization(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getAuthorize - Authorize user
     *
     * Authorize a user by sending them through the [Box](https://box.com)
     * website and request their permission to act on their behalf.
     * 
     * This is the first step when authenticating a user using
     * OAuth 2.0. To request a user's authorization to use the Box APIs
     * on their behalf you will need to send a user to the URL with this
     * format.
    **/
    public .models.operations.GetAuthorizeResponse getAuthorize(.models.operations.GetAuthorizeRequest request) throws Exception {
        String baseUrl = .models.operations.GetAuthorizeRequestServerList.SERVERS[0];
        if (request.serverURL != null && !request.serverURL.isBlank()) {
            baseUrl = request.serverURL;
        }
        
        String url = .utils.Utils.generateURL(baseUrl, "/authorize");
        
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

        .models.operations.GetAuthorizeResponse res = new .models.operations.GetAuthorizeResponse() {{
            getAuthorize200TextHTMLHTMLString = null;
            getAuthorizeDefaultTextHTMLHTMLString = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "text/html")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getAuthorize200TextHTMLHTMLString = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "text/html")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getAuthorizeDefaultTextHTMLHTMLString = out;
            }
        }

        return res;
    }
	
	
    /**
     * postOauth2Revoke - Revoke access token
     *
     * Revoke an active Access Token, effectively logging a user out
     * that has been previously authenticated.
    **/
    public .models.operations.PostOauth2RevokeResponse postOauth2Revoke(.models.operations.PostOauth2RevokeRequest request) throws Exception {
        String baseUrl = .models.operations.PostOauth2RevokeRequestServerList.SERVERS[0];
        if (request.serverURL != null && !request.serverURL.isBlank()) {
            baseUrl = request.serverURL;
        }
        
        String url = .utils.Utils.generateURL(baseUrl, "/oauth2/revoke");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostOauth2RevokeResponse res = new .models.operations.PostOauth2RevokeResponse() {{
            oAuth2Error = null;
            oAuth2Error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }

        return res;
    }
	
	
    /**
     * postOauth2Token - Request access token
     *
     * Request an Access Token using either a client-side obtained OAuth 2.0
     * authorization code or a server-side JWT assertion.
     * 
     * An Access Token is a string that enables Box to verify that a
     * request belongs to an authorized session. In the normal order of
     * operations you will begin by requesting authentication from the
     * [authorize](#get-authorize) endpoint and Box will send you an
     * authorization code.
     * 
     * You will then send this code to this endpoint to exchange it for
     * an Access Token. The returned Access Token can then be used to to make
     * Box API calls.
    **/
    public .models.operations.PostOauth2TokenResponse postOauth2Token(.models.operations.PostOauth2TokenRequest request) throws Exception {
        String baseUrl = .models.operations.PostOauth2TokenRequestServerList.SERVERS[0];
        if (request.serverURL != null && !request.serverURL.isBlank()) {
            baseUrl = request.serverURL;
        }
        
        String url = .utils.Utils.generateURL(baseUrl, "/oauth2/token");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostOauth2TokenResponse res = new .models.operations.PostOauth2TokenResponse() {{
            accessToken = null;
            oAuth2Error = null;
            oAuth2Error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AccessToken out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AccessToken.class);
                res.accessToken = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }

        return res;
    }
	
	
    /**
     * postOauth2TokenNumberRefresh - Refresh access token
     *
     * Refresh an Access Token using its client ID, secret, and refresh token.
    **/
    public .models.operations.PostOauth2TokenNumberRefreshResponse postOauth2TokenNumberRefresh(.models.operations.PostOauth2TokenNumberRefreshRequest request) throws Exception {
        String baseUrl = .models.operations.PostOauth2TokenNumberRefreshRequestServerList.SERVERS[0];
        if (request.serverURL != null && !request.serverURL.isBlank()) {
            baseUrl = request.serverURL;
        }
        
        String url = .utils.Utils.generateURL(baseUrl, "/oauth2/token#refresh");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostOauth2TokenNumberRefreshResponse res = new .models.operations.PostOauth2TokenNumberRefreshResponse() {{
            accessToken = null;
            oAuth2Error = null;
            oAuth2Error = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AccessToken out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AccessToken.class);
                res.accessToken = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }
        else {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.OAuth2Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.OAuth2Error.class);
                res.oAuth2Error = out;
            }
        }

        return res;
    }
	
}