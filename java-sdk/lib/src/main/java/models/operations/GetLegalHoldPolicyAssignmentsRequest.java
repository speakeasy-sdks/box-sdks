package .models.operations;



public class GetLegalHoldPolicyAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPolicyAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsQueryParams queryParams;
    public GetLegalHoldPolicyAssignmentsRequest withQueryParams(GetLegalHoldPolicyAssignmentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}