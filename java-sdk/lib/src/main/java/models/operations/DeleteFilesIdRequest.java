package .models.operations;



public class DeleteFilesIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFilesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFilesIdPathParams pathParams;
    public DeleteFilesIdRequest withPathParams(DeleteFilesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteFilesIdHeaders headers;
    public DeleteFilesIdRequest withHeaders(DeleteFilesIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}