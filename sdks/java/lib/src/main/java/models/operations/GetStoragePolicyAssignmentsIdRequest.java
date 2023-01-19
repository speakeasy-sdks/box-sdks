package .models.operations;



public class GetStoragePolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetStoragePolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetStoragePolicyAssignmentsIdPathParams pathParams;
    public GetStoragePolicyAssignmentsIdRequest withPathParams(GetStoragePolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}