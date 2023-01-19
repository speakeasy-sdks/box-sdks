package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class RetentionPolicyAssignments {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public RetentionPolicyAssignments(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteRetentionPolicyAssignmentsId - Remove retention policy assignment
     *
     * Removes a retention policy assignment
     * applied to content.
    **/
    public .models.operations.DeleteRetentionPolicyAssignmentsIdResponse deleteRetentionPolicyAssignmentsId(.models.operations.DeleteRetentionPolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policy_assignments/{retention_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteRetentionPolicyAssignmentsIdResponse res = new .models.operations.DeleteRetentionPolicyAssignmentsIdResponse() {{
            clientError = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 403) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
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
     * getRetentionPoliciesIdAssignments - List retention policy assignments
     *
     * Returns a list of all retention policy assignments associated with a specified
     * retention policy.
    **/
    public .models.operations.GetRetentionPoliciesIdAssignmentsResponse getRetentionPoliciesIdAssignments(.models.operations.GetRetentionPoliciesIdAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policies/{retention_policy_id}/assignments", request.pathParams);
        
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

        .models.operations.GetRetentionPoliciesIdAssignmentsResponse res = new .models.operations.GetRetentionPoliciesIdAssignmentsResponse() {{
            retentionPolicyAssignments = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RetentionPolicyAssignments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RetentionPolicyAssignments.class);
                res.retentionPolicyAssignments = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
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
     * getRetentionPolicyAssignmentsId - Get retention policy assignment
     *
     * Retrieves a retention policy assignment
    **/
    public .models.operations.GetRetentionPolicyAssignmentsIdResponse getRetentionPolicyAssignmentsId(.models.operations.GetRetentionPolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policy_assignments/{retention_policy_assignment_id}", request.pathParams);
        
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

        .models.operations.GetRetentionPolicyAssignmentsIdResponse res = new .models.operations.GetRetentionPolicyAssignmentsIdResponse() {{
            retentionPolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RetentionPolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RetentionPolicyAssignment.class);
                res.retentionPolicyAssignment = out;
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
     * getRetentionPolicyAssignmentsIdFileVersionsUnderRetention - Get file versions under retention
     *
     * Returns a list of file versions under retention for a retention policy
     * assignment.
    **/
    public .models.operations.GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse getRetentionPolicyAssignmentsIdFileVersionsUnderRetention(.models.operations.GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policy_assignments/{retention_policy_assignment_id}/file_versions_under_retention", request.pathParams);
        
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

        .models.operations.GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse res = new .models.operations.GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse() {{
            filesUnderRetention = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FilesUnderRetention out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FilesUnderRetention.class);
                res.filesUnderRetention = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
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
     * getRetentionPolicyAssignmentsIdFilesUnderRetention - Get files under retention
     *
     * Returns a list of files under retention for a retention policy assignment.
    **/
    public .models.operations.GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse getRetentionPolicyAssignmentsIdFilesUnderRetention(.models.operations.GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policy_assignments/{retention_policy_assignment_id}/files_under_retention", request.pathParams);
        
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

        .models.operations.GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse res = new .models.operations.GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse() {{
            filesUnderRetention = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FilesUnderRetention out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FilesUnderRetention.class);
                res.filesUnderRetention = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
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
     * postRetentionPolicyAssignments - Assign retention policy
     *
     * Assigns a retention policy to an item.
    **/
    public .models.operations.PostRetentionPolicyAssignmentsResponse postRetentionPolicyAssignments(.models.operations.PostRetentionPolicyAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/retention_policy_assignments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostRetentionPolicyAssignmentsResponse res = new .models.operations.PostRetentionPolicyAssignmentsResponse() {{
            retentionPolicyAssignment = null;
            clientError = null;
            clientError = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.RetentionPolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.RetentionPolicyAssignment.class);
                res.retentionPolicyAssignment = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
            }
        }
        else if (httpRes.statusCode() == 409) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ClientError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClientError.class);
                res.clientError = out;
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