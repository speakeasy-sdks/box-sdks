package .models.operations;



public class DeleteCommentsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteCommentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteCommentsIdPathParams pathParams;
    public DeleteCommentsIdRequest withPathParams(DeleteCommentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}