package .models.operations;



public class DeleteGroupsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteGroupsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteGroupsIdPathParams pathParams;
    public DeleteGroupsIdRequest withPathParams(DeleteGroupsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}