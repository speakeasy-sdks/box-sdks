package .models.operations;



public class GetStoragePolicyAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public GetStoragePolicyAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetStoragePolicyAssignmentsQueryParams queryParams;
    public GetStoragePolicyAssignmentsRequest withQueryParams(GetStoragePolicyAssignmentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}