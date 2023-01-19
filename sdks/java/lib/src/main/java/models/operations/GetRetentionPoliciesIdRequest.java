package .models.operations;



public class GetRetentionPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPoliciesIdPathParams pathParams;
    public GetRetentionPoliciesIdRequest withPathParams(GetRetentionPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetRetentionPoliciesIdQueryParams queryParams;
    public GetRetentionPoliciesIdRequest withQueryParams(GetRetentionPoliciesIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}