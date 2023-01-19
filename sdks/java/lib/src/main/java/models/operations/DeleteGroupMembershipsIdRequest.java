package .models.operations;



public class DeleteGroupMembershipsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteGroupMembershipsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteGroupMembershipsIdPathParams pathParams;
    public DeleteGroupMembershipsIdRequest withPathParams(DeleteGroupMembershipsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}