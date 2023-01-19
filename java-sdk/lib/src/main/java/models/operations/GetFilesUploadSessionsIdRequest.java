package .models.operations;



public class GetFilesUploadSessionsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesUploadSessionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public GetFilesUploadSessionsIdRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public GetFilesUploadSessionsIdPathParams pathParams;
    public GetFilesUploadSessionsIdRequest withPathParams(GetFilesUploadSessionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}