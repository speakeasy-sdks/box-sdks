package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class StoragePolicyAssignments {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public StoragePolicyAssignments(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteStoragePolicyAssignmentsId - Unassign storage policy
     *
     * Delete a storage policy assignment.
     * 
     * Deleting a storage policy assignment on a user
     * will have the user inherit the enterprise's default
     * storage policy.
     * 
     * There is a rate limit for calling this endpoint of only
     * twice per user in a 24 hour time frame.
    **/
    public .models.operations.DeleteStoragePolicyAssignmentsIdResponse deleteStoragePolicyAssignmentsId(.models.operations.DeleteStoragePolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/storage_policy_assignments/{storage_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteStoragePolicyAssignmentsIdResponse res = new .models.operations.DeleteStoragePolicyAssignmentsIdResponse() {{
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
     * getStoragePolicyAssignments - List storage policy assignments
     *
     * Fetches all the storage policy assignment for an enterprise or user.
    **/
    public .models.operations.GetStoragePolicyAssignmentsResponse getStoragePolicyAssignments(.models.operations.GetStoragePolicyAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/storage_policy_assignments");
        
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

        .models.operations.GetStoragePolicyAssignmentsResponse res = new .models.operations.GetStoragePolicyAssignmentsResponse() {{
            storagePolicyAssignments = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.StoragePolicyAssignments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.StoragePolicyAssignments.class);
                res.storagePolicyAssignments = out;
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
     * getStoragePolicyAssignmentsId - Get storage policy assignment
     *
     * Fetches a specific storage policy assignment.
    **/
    public .models.operations.GetStoragePolicyAssignmentsIdResponse getStoragePolicyAssignmentsId(.models.operations.GetStoragePolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/storage_policy_assignments/{storage_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetStoragePolicyAssignmentsIdResponse res = new .models.operations.GetStoragePolicyAssignmentsIdResponse() {{
            storagePolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.StoragePolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.StoragePolicyAssignment.class);
                res.storagePolicyAssignment = out;
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
     * postStoragePolicyAssignments - Assign storage policy
     *
     * Creates a storage policy assignment for an enterprise or user.
    **/
    public .models.operations.PostStoragePolicyAssignmentsResponse postStoragePolicyAssignments(.models.operations.PostStoragePolicyAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/storage_policy_assignments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostStoragePolicyAssignmentsResponse res = new .models.operations.PostStoragePolicyAssignmentsResponse() {{
            storagePolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.StoragePolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.StoragePolicyAssignment.class);
                res.storagePolicyAssignment = out;
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
     * putStoragePolicyAssignmentsId - Update storage policy assignment
     *
     * Updates a specific storage policy assignment.
    **/
    public .models.operations.PutStoragePolicyAssignmentsIdResponse putStoragePolicyAssignmentsId(.models.operations.PutStoragePolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/storage_policy_assignments/{storage_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutStoragePolicyAssignmentsIdResponse res = new .models.operations.PutStoragePolicyAssignmentsIdResponse() {{
            storagePolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.StoragePolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.StoragePolicyAssignment.class);
                res.storagePolicyAssignment = out;
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