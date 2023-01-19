package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class FileVersionLegalHolds {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public FileVersionLegalHolds(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getFileVersionLegalHolds - List file version legal holds
     *
     * Get a list of file versions on legal hold for a legal hold
     * assignment.
     * 
     * Due to ongoing re-architecture efforts this API might not return all file
     * versions for this policy ID.
     * 
     * Instead, this API will only return file versions held in the legacy
     * architecture. Two new endpoints will available to request any file versions
     * held in the new architecture.
     * 
     * For file versions held in the new architecture, the `GET
     * /legal_hold_policy_assignments/:id/file_versions_on_hold` API can be used to
     * return all past file versions available for this policy assignment, and the
     * `GET /legal_hold_policy_assignments/:id/files_on_hold` API can be used to
     * return any current (latest) versions of a file under legal hold.
     * 
     * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
     * find a list of policy assignments for a given policy ID.
     * 
     * Once the re-architecture is completed this API will be deprecated.
    **/
    public .models.operations.GetFileVersionLegalHoldsResponse getFileVersionLegalHolds(.models.operations.GetFileVersionLegalHoldsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/file_version_legal_holds");
        
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

        .models.operations.GetFileVersionLegalHoldsResponse res = new .models.operations.GetFileVersionLegalHoldsResponse() {{
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
     * getFileVersionLegalHoldsId - Get file version legal hold
     *
     * Retrieves information about the legal hold policies
     * assigned to a file version.
    **/
    public .models.operations.GetFileVersionLegalHoldsIdResponse getFileVersionLegalHoldsId(.models.operations.GetFileVersionLegalHoldsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/file_version_legal_holds/{file_version_legal_hold_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetFileVersionLegalHoldsIdResponse res = new .models.operations.GetFileVersionLegalHoldsIdResponse() {{
            fileVersionLegalHold = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.FileVersionLegalHold out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.FileVersionLegalHold.class);
                res.fileVersionLegalHold = out;
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