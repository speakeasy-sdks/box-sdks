package .models.operations;



public class DeleteFolderLocksIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFolderLocksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFolderLocksIdPathParams pathParams;
    public DeleteFolderLocksIdRequest withPathParams(DeleteFolderLocksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}