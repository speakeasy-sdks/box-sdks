package .models.operations;



public class GetRetentionPoliciesRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPoliciesQueryParams queryParams;
    public GetRetentionPoliciesRequest withQueryParams(GetRetentionPoliciesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}