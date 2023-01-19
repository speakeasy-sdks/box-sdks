package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;

public class ClassificationsOnFolders {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ClassificationsOnFolders(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Remove classification from folder
     *
     * Removes any classifications from a folder.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
    **/
    public .models.operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse deleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(.models.operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse res = new .models.operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse() {{
            clientError = null;
            clientError = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
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
        else if (httpRes.statusCode() == 405) {
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
     * getFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Get classification on folder
     *
     * Retrieves the classification metadata instance that
     * has been applied to a folder.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
    **/
    public .models.operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse getFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(.models.operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse res = new .models.operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse() {{
            classification = null;
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
                .models.shared.Classification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Classification.class);
                res.classification = out;
            }
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
        else if (httpRes.statusCode() == 405) {
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
     * postFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Add classification to folder
     *
     * Adds a classification to a folder by specifying the label of the
     * classification to add.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
    **/
    public .models.operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse postFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(.models.operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse res = new .models.operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse() {{
            classification = null;
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
                .models.shared.Classification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Classification.class);
                res.classification = out;
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
	
	
    /**
     * putFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Update classification on folder
     *
     * Updates a classification on a folder.
     * 
     * The classification can only be updated if a classification has already been
     * applied to the folder before. When editing classifications, only values are
     * defined for the enterprise will be accepted.
    **/
    public .models.operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse putFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(.models.operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse res = new .models.operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse() {{
            classification = null;
            clientError = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.Classification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Classification.class);
                res.classification = out;
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
        else if (httpRes.statusCode() == 500) {
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