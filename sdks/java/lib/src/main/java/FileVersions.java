package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class FileVersions {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public FileVersions(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * deleteFilesIdVersionsId - Remove file version
     *
     * Move a file version to the trash.
     * 
     * Versions are only tracked for Box users with premium accounts.
    **/
    public .models.operations.DeleteFilesIdVersionsIdResponse deleteFilesIdVersionsId(.models.operations.DeleteFilesIdVersionsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/files/{file_id}/versions/{file_version_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        java.util.Map<String, java.util.List<String>> headers = .utils.Utils.getHeaders(request.headers);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteFilesIdVersionsIdResponse res = new .models.operations.DeleteFilesIdVersionsIdResponse() {{
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
     * getFilesIdVersions - List all file versions
     *
     * Retrieve a list of the past versions for a file.
     * 
     * Versions are only tracked by Box users with premium accounts. To fetch the ID
     * of the current version of a file, use the `GET /file/:id` API.
    **/
    public .models.operations.GetFilesIdVersionsResponse getFilesIdVersions(.models.operations.GetFilesIdVersionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/files/{file_id}/versions", request.pathParams);
        
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

        .models.operations.GetFilesIdVersionsResponse res = new .models.operations.GetFilesIdVersionsResponse() {{
            fileVersions = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersions out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersions.class);
                res.fileVersions = out;
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
     * getFilesIdVersionsId - Get file version
     *
     * Retrieve a specific version of a file.
     * 
     * Versions are only tracked for Box users with premium accounts.
    **/
    public .models.operations.GetFilesIdVersionsIdResponse getFilesIdVersionsId(.models.operations.GetFilesIdVersionsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/files/{file_id}/versions/{file_version_id}", request.pathParams);
        
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

        .models.operations.GetFilesIdVersionsIdResponse res = new .models.operations.GetFilesIdVersionsIdResponse() {{
            fileVersion = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersion out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersion.class);
                res.fileVersion = out;
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
     * postFilesIdVersionsCurrent - Promote file version
     *
     * Promote a specific version of a file.
     * 
     * If previous versions exist, this method can be used to
     * promote one of the older versions to the top of the version history.
     * 
     * This creates a new copy of the old version and puts it at the
     * top of the versions history. The file will have the exact same contents
     * as the older version, with the the same hash digest, `etag`, and
     * name as the original.
     * 
     * Other properties such as comments do not get updated to their
     * former values.
     * 
     * Don't use this endpoint to restore Box Notes,
     * as it works with file formats such as PDF, DOC,
     * PPTX or similar.
    **/
    public .models.operations.PostFilesIdVersionsCurrentResponse postFilesIdVersionsCurrent(.models.operations.PostFilesIdVersionsCurrentRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/files/{file_id}/versions/current", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostFilesIdVersionsCurrentResponse res = new .models.operations.PostFilesIdVersionsCurrentResponse() {{
            fileVersion = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersion out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersion.class);
                res.fileVersion = out;
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
     * putFilesIdVersionsId - Restore file version
     *
     * Restores a specific version of a file after it was deleted.
     * Don't use this endpoint to restore Box Notes,
     * as it works with file formats such as PDF, DOC,
     * PPTX or similar.
    **/
    public .models.operations.PutFilesIdVersionsIdResponse putFilesIdVersionsId(.models.operations.PutFilesIdVersionsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/files/{file_id}/versions/{file_version_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutFilesIdVersionsIdResponse res = new .models.operations.PutFilesIdVersionsIdResponse() {{
            fileVersion = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersion out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersion.class);
                res.fileVersion = out;
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