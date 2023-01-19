package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class TransferFolders {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public TransferFolders(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * putUsersIdFolders0 - Transfer owned folders
     *
     * Move all of the items (files, folders and workflows) owned by a user into
     * another user's account
     * 
     * Only the root folder (`0`) can be transferred.
     * 
     * Folders can only be moved across users by users with administrative
     * permissions.
     * 
     * All existing shared links and folder-level collaborations are transferred
     * during the operation. Please note that while collaborations at the individual
     * file-level are transferred during the operation, the collaborations are
     * deleted when the original user is deleted.
     * 
     * This call will be performed synchronously which might lead to a slow response
     * when the source user has a large number of items in all of its folders.
     * 
     * If the destination path has a metadata cascade policy attached to any of
     * the parent folders, a metadata cascade operation will be kicked off
     * asynchronously.
     * 
     * There is currently no way to check for when this operation is finished.
     * 
     * The destination folder's name will be in the format `{User}'s Files and
     * Folders`, where `{User}` is the display name of the user.
     * 
     * To make this API call your application will need to have the "Read and write
     * all files and folders stored in Box" scope enabled.
     * 
     * Please make sure the destination user has access to `Relay` or `Relay Lite`,
     * and has access to the files and folders involved in the workflows being
     * transferred.
     * 
     * Admins will receive an email when the operation is completed.
    **/
    public .models.operations.PutUsersIdFolders0Response putUsersIdFolders0(.models.operations.PutUsersIdFolders0Request request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/users/{user_id}/folders/0", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
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

        .models.operations.PutUsersIdFolders0Response res = new .models.operations.PutUsersIdFolders0Response() {{
            folder = null;
            clientError = null;
            clientError = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.Folder out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Folder.class);
                res.folder = out;
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