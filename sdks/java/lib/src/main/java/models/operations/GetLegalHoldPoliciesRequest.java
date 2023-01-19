package .models.operations;



public class GetLegalHoldPoliciesRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPoliciesQueryParams queryParams;
    public GetLegalHoldPoliciesRequest withQueryParams(GetLegalHoldPoliciesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}