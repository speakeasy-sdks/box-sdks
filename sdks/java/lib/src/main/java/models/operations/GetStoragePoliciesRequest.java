package .models.operations;



public class GetStoragePoliciesRequest {
    public .models.utils.RetryConfig retries;
    public GetStoragePoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetStoragePoliciesQueryParams queryParams;
    public GetStoragePoliciesRequest withQueryParams(GetStoragePoliciesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}