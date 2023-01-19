package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class LegalHoldPolicyAssignments {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public LegalHoldPolicyAssignments(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteLegalHoldPolicyAssignmentsId - Unassign legal hold policy
     *
     * Remove a legal hold from an item.
     * 
     * This is an asynchronous process. The policy will not be
     * fully removed yet when the response returns.
    **/
    public .models.operations.DeleteLegalHoldPolicyAssignmentsIdResponse deleteLegalHoldPolicyAssignmentsId(.models.operations.DeleteLegalHoldPolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteLegalHoldPolicyAssignmentsIdResponse res = new .models.operations.DeleteLegalHoldPolicyAssignmentsIdResponse() {{
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 202) {
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
     * getLegalHoldPolicyAssignments - List legal hold policy assignments
     *
     * Retrieves a list of items a legal hold policy has been assigned to.
    **/
    public .models.operations.GetLegalHoldPolicyAssignmentsResponse getLegalHoldPolicyAssignments(.models.operations.GetLegalHoldPolicyAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments");
        
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

        .models.operations.GetLegalHoldPolicyAssignmentsResponse res = new .models.operations.GetLegalHoldPolicyAssignmentsResponse() {{
            legalHoldPolicyAssignments = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.LegalHoldPolicyAssignments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.LegalHoldPolicyAssignments.class);
                res.legalHoldPolicyAssignments = out;
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
     * getLegalHoldPolicyAssignmentsId - Get legal hold policy assignment
     *
     * Retrieve a legal hold policy assignment.
    **/
    public .models.operations.GetLegalHoldPolicyAssignmentsIdResponse getLegalHoldPolicyAssignmentsId(.models.operations.GetLegalHoldPolicyAssignmentsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetLegalHoldPolicyAssignmentsIdResponse res = new .models.operations.GetLegalHoldPolicyAssignmentsIdResponse() {{
            legalHoldPolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.LegalHoldPolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.LegalHoldPolicyAssignment.class);
                res.legalHoldPolicyAssignment = out;
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
     * getLegalHoldPolicyAssignmentsIdFileVersionsOnHold - List previous file versions for legal hold policy assignment
     *
     * Get a list of previous file versions for a legal hold
     * assignment.
     * 
     * In some cases you may only need the latest file versions instead. In these
     * cases, use the `GET  /legal_hold_policy_assignments/:id/files_on_hold` API
     * instead to return any current (latest) versions of a file for this legal hold
     * policy assignment.
     * 
     * Due to ongoing re-architecture efforts this API might not return all files
     * held for this policy ID. Instead, this API will only return past file versions
     * held in the newly developed architecture. The `GET /file_version_legal_holds`
     * API can be used to fetch current and past versions of files held within the
     * legacy architecture.
     * 
     * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
     * find a list of policy assignments for a given policy ID.
    **/
    public .models.operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse getLegalHoldPolicyAssignmentsIdFileVersionsOnHold(.models.operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold", request.pathParams);
        
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

        .models.operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse res = new .models.operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse() {{
            fileVersionLegalHolds = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersionLegalHolds out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersionLegalHolds.class);
                res.fileVersionLegalHolds = out;
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
     * getLegalHoldPolicyAssignmentsIdFilesOnHold - List current file versions for legal hold policy assignment
     *
     * Get a list of current file versions for a legal hold
     * assignment.
     * 
     * In some cases you may want to get previous file versions instead. In these
     * cases, use the `GET  /legal_hold_policy_assignments/:id/file_versions_on_hold`
     * API instead to return any previous versions of a file for this legal hold
     * policy assignment.
     * 
     * Due to ongoing re-architecture efforts this API might not return all file
     * versions held for this policy ID. Instead, this API will only return the
     * latest file version held in the newly developed architecture. The `GET
     * /file_version_legal_holds` API can be used to fetch current and past versions
     * of files held within the legacy architecture.
     * 
     * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
     * find a list of policy assignments for a given policy ID.
    **/
    public .models.operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse getLegalHoldPolicyAssignmentsIdFilesOnHold(.models.operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold", request.pathParams);
        
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

        .models.operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse res = new .models.operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse() {{
            fileVersionLegalHolds = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersionLegalHolds out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersionLegalHolds.class);
                res.fileVersionLegalHolds = out;
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
     * postLegalHoldPolicyAssignments - Assign legal hold policy
     *
     * Assign a legal hold to a file, file version, folder, or user.
    **/
    public .models.operations.PostLegalHoldPolicyAssignmentsResponse postLegalHoldPolicyAssignments(.models.operations.PostLegalHoldPolicyAssignmentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/legal_hold_policy_assignments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostLegalHoldPolicyAssignmentsResponse res = new .models.operations.PostLegalHoldPolicyAssignmentsResponse() {{
            legalHoldPolicyAssignment = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.LegalHoldPolicyAssignment out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.LegalHoldPolicyAssignment.class);
                res.legalHoldPolicyAssignment = out;
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