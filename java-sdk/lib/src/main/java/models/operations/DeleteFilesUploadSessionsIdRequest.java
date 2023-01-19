package .models.operations;



public class DeleteFilesUploadSessionsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFilesUploadSessionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public DeleteFilesUploadSessionsIdRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public DeleteFilesUploadSessionsIdPathParams pathParams;
    public DeleteFilesUploadSessionsIdRequest withPathParams(DeleteFilesUploadSessionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}