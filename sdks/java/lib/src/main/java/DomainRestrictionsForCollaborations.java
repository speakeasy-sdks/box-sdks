package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class DomainRestrictionsForCollaborations {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DomainRestrictionsForCollaborations(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteCollaborationWhitelistEntriesId - Remove domain from list of allowed collaboration domains
     *
     * Removes a domain from the list of domains that have been deemed safe to create
     * collaborations for within the current enterprise.
    **/
    public .models.operations.DeleteCollaborationWhitelistEntriesIdResponse deleteCollaborationWhitelistEntriesId(.models.operations.DeleteCollaborationWhitelistEntriesIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_entries/{collaboration_whitelist_entry_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteCollaborationWhitelistEntriesIdResponse res = new .models.operations.DeleteCollaborationWhitelistEntriesIdResponse() {{
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
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
     * getCollaborationWhitelistEntries - List allowed collaboration domains
     *
     * Returns the list domains that have been deemed safe to create collaborations
     * for within the current enterprise.
    **/
    public .models.operations.GetCollaborationWhitelistEntriesResponse getCollaborationWhitelistEntries(.models.operations.GetCollaborationWhitelistEntriesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_entries");
        
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

        .models.operations.GetCollaborationWhitelistEntriesResponse res = new .models.operations.GetCollaborationWhitelistEntriesResponse() {{
            collaborationAllowlistEntries = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistEntries out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistEntries.class);
                res.collaborationAllowlistEntries = out;
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
     * getCollaborationWhitelistEntriesId - Get allowed collaboration domain
     *
     * Returns a domain that has been deemed safe to create collaborations
     * for within the current enterprise.
    **/
    public .models.operations.GetCollaborationWhitelistEntriesIdResponse getCollaborationWhitelistEntriesId(.models.operations.GetCollaborationWhitelistEntriesIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_entries/{collaboration_whitelist_entry_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetCollaborationWhitelistEntriesIdResponse res = new .models.operations.GetCollaborationWhitelistEntriesIdResponse() {{
            collaborationAllowlistEntry = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistEntry out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistEntry.class);
                res.collaborationAllowlistEntry = out;
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
     * postCollaborationWhitelistEntries - Add domain to list of allowed collaboration domains
     *
     * Creates a new entry in the list of allowed domains to allow
     * collaboration for.
    **/
    public .models.operations.PostCollaborationWhitelistEntriesResponse postCollaborationWhitelistEntries(.models.operations.PostCollaborationWhitelistEntriesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_entries");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostCollaborationWhitelistEntriesResponse res = new .models.operations.PostCollaborationWhitelistEntriesResponse() {{
            collaborationAllowlistEntry = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistEntry out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistEntry.class);
                res.collaborationAllowlistEntry = out;
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