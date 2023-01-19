package .models.operations;



public class DeleteFilesIdVersionsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFilesIdVersionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFilesIdVersionsIdPathParams pathParams;
    public DeleteFilesIdVersionsIdRequest withPathParams(DeleteFilesIdVersionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteFilesIdVersionsIdHeaders headers;
    public DeleteFilesIdVersionsIdRequest withHeaders(DeleteFilesIdVersionsIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}