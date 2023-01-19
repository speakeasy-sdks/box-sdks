package .models.operations;



public class GetMetadataCascadePoliciesRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataCascadePoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataCascadePoliciesQueryParams queryParams;
    public GetMetadataCascadePoliciesRequest withQueryParams(GetMetadataCascadePoliciesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}