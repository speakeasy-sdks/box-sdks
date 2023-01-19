package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;

public class Classifications {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Classifications(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema - Delete all classifications
     *
     * Delete all classifications by deleting the classification
     * metadata template.
    **/
    public .models.operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse deleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema(.models.operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse res = new .models.operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse() {{
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
     * getMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema - List all classifications
     *
     * Retrieves the classification metadata template and lists all the
     * classifications available to this enterprise.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
    **/
    public .models.operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse getMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema(.models.operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse res = new .models.operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse() {{
            classificationTemplate = null;
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
                .models.shared.ClassificationTemplate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClassificationTemplate.class);
                res.classificationTemplate = out;
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
     * postMetadataTemplatesSchemaNumberClassifications - Add initial classifications
     *
     * When an enterprise does not yet have any classifications, this API call
     * initializes the classification template with an initial set of
     * classifications.
     * 
     * If an enterprise already has a classification, the template will already
     * exist and instead an API call should be made to add additional
     * classifications.
    **/
    public .models.operations.PostMetadataTemplatesSchemaNumberClassificationsResponse postMetadataTemplatesSchemaNumberClassifications(.models.operations.PostMetadataTemplatesSchemaNumberClassificationsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/schema#classifications");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostMetadataTemplatesSchemaNumberClassificationsResponse res = new .models.operations.PostMetadataTemplatesSchemaNumberClassificationsResponse() {{
            classificationTemplate = null;
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
                .models.shared.ClassificationTemplate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClassificationTemplate.class);
                res.classificationTemplate = out;
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
     * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAdd - Add classification
     *
     * Adds one or more new classifications to the list of classifications
     * available to the enterprise.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
    **/
    public .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAdd(.models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse res = new .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse() {{
            classificationTemplate = null;
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
                .models.shared.ClassificationTemplate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClassificationTemplate.class);
                res.classificationTemplate = out;
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
     * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDelete - Delete classification
     *
     * Removes a classification from the list of classifications
     * available to the enterprise.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
    **/
    public .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDelete(.models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#delete");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse res = new .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse() {{
            classificationTemplate = null;
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
                .models.shared.ClassificationTemplate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClassificationTemplate.class);
                res.classificationTemplate = out;
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
     * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdate - Update classification
     *
     * Updates the labels and descriptions of one or more classifications
     * available to the enterprise.
     * 
     * This API can also be called by including the enterprise ID in the
     * URL explicitly, for example
     * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
    **/
    public .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdate(.models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse res = new .models.operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse() {{
            classificationTemplate = null;
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
                .models.shared.ClassificationTemplate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ClassificationTemplate.class);
                res.classificationTemplate = out;
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