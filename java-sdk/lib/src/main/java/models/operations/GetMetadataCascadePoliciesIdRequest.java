package .models.operations;



public class GetMetadataCascadePoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataCascadePoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataCascadePoliciesIdPathParams pathParams;
    public GetMetadataCascadePoliciesIdRequest withPathParams(GetMetadataCascadePoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}