package .models.operations;



public class GetStoragePoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetStoragePoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetStoragePoliciesIdPathParams pathParams;
    public GetStoragePoliciesIdRequest withPathParams(GetStoragePoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}