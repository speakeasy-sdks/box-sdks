package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class DomainRestrictionsUserExemptions {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DomainRestrictionsUserExemptions(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteCollaborationWhitelistExemptTargetsId - Remove user from list of users exempt from domain restrictions
     *
     * Removes a user's exemption from the restrictions set out by the allowed list
     * of domains for collaborations.
    **/
    public .models.operations.DeleteCollaborationWhitelistExemptTargetsIdResponse deleteCollaborationWhitelistExemptTargetsId(.models.operations.DeleteCollaborationWhitelistExemptTargetsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteCollaborationWhitelistExemptTargetsIdResponse res = new .models.operations.DeleteCollaborationWhitelistExemptTargetsIdResponse() {{
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
     * getCollaborationWhitelistExemptTargets - List users exempt from collaboration domain restrictions
     *
     * Returns a list of users who have been exempt from the collaboration
     * domain restrictions.
    **/
    public .models.operations.GetCollaborationWhitelistExemptTargetsResponse getCollaborationWhitelistExemptTargets(.models.operations.GetCollaborationWhitelistExemptTargetsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_exempt_targets");
        
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

        .models.operations.GetCollaborationWhitelistExemptTargetsResponse res = new .models.operations.GetCollaborationWhitelistExemptTargetsResponse() {{
            collaborationAllowlistExemptTargets = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistExemptTargets out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistExemptTargets.class);
                res.collaborationAllowlistExemptTargets = out;
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
     * getCollaborationWhitelistExemptTargetsId - Get user exempt from collaboration domain restrictions
     *
     * Returns a users who has been exempt from the collaboration
     * domain restrictions.
    **/
    public .models.operations.GetCollaborationWhitelistExemptTargetsIdResponse getCollaborationWhitelistExemptTargetsId(.models.operations.GetCollaborationWhitelistExemptTargetsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetCollaborationWhitelistExemptTargetsIdResponse res = new .models.operations.GetCollaborationWhitelistExemptTargetsIdResponse() {{
            collaborationAllowlistExemptTarget = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistExemptTarget out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistExemptTarget.class);
                res.collaborationAllowlistExemptTarget = out;
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
     * postCollaborationWhitelistExemptTargets - Create user exemption from collaboration domain restrictions
     *
     * Exempts a user from the restrictions set out by the allowed list of domains
     * for collaborations.
    **/
    public .models.operations.PostCollaborationWhitelistExemptTargetsResponse postCollaborationWhitelistExemptTargets(.models.operations.PostCollaborationWhitelistExemptTargetsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/collaboration_whitelist_exempt_targets");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostCollaborationWhitelistExemptTargetsResponse res = new .models.operations.PostCollaborationWhitelistExemptTargetsResponse() {{
            collaborationAllowlistExemptTarget = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.CollaborationAllowlistExemptTarget out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.CollaborationAllowlistExemptTarget.class);
                res.collaborationAllowlistExemptTarget = out;
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