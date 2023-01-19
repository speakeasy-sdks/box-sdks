package .models.operations;



public class DeleteFileRequestsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFileRequestsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFileRequestsIdPathParams pathParams;
    public DeleteFileRequestsIdRequest withPathParams(DeleteFileRequestsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}