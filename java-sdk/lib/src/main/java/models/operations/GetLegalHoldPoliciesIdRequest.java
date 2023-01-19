package .models.operations;



public class GetLegalHoldPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPoliciesIdPathParams pathParams;
    public GetLegalHoldPoliciesIdRequest withPathParams(GetLegalHoldPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}