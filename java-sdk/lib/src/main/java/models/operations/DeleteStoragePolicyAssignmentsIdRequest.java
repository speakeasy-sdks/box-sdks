package .models.operations;



public class DeleteStoragePolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteStoragePolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteStoragePolicyAssignmentsIdPathParams pathParams;
    public DeleteStoragePolicyAssignmentsIdRequest withPathParams(DeleteStoragePolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}