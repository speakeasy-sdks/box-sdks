package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class TermsOfServiceUserStatuses {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public TermsOfServiceUserStatuses(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getTermsOfServiceUserStatuses - List terms of service user statuses
     *
     * Retrieves an overview of users and their status for a
     * terms of service, including Whether they have accepted
     * the terms and when.
    **/
    public .models.operations.GetTermsOfServiceUserStatusesResponse getTermsOfServiceUserStatuses(.models.operations.GetTermsOfServiceUserStatusesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/terms_of_service_user_statuses");
        
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

        .models.operations.GetTermsOfServiceUserStatusesResponse res = new .models.operations.GetTermsOfServiceUserStatusesResponse() {{
            termsOfServiceUserStatuses = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.TermsOfServiceUserStatuses out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TermsOfServiceUserStatuses.class);
                res.termsOfServiceUserStatuses = out;
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
     * postTermsOfServiceUserStatuses - Create terms of service status for new user
     *
     * Sets the status for a terms of service for a user.
    **/
    public .models.operations.PostTermsOfServiceUserStatusesResponse postTermsOfServiceUserStatuses(.models.operations.PostTermsOfServiceUserStatusesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/terms_of_service_user_statuses");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostTermsOfServiceUserStatusesResponse res = new .models.operations.PostTermsOfServiceUserStatusesResponse() {{
            termsOfServiceUserStatus = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.TermsOfServiceUserStatus out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TermsOfServiceUserStatus.class);
                res.termsOfServiceUserStatus = out;
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
     * putTermsOfServiceUserStatusesId - Update terms of service status for existing user
     *
     * Updates the status for a terms of service for a user.
    **/
    public .models.operations.PutTermsOfServiceUserStatusesIdResponse putTermsOfServiceUserStatusesId(.models.operations.PutTermsOfServiceUserStatusesIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/terms_of_service_user_statuses/{terms_of_service_user_status_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutTermsOfServiceUserStatusesIdResponse res = new .models.operations.PutTermsOfServiceUserStatusesIdResponse() {{
            termsOfServiceUserStatus = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.TermsOfServiceUserStatus out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TermsOfServiceUserStatus.class);
                res.termsOfServiceUserStatus = out;
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