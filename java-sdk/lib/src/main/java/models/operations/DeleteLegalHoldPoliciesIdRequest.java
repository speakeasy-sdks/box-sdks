package .models.operations;



public class DeleteLegalHoldPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteLegalHoldPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteLegalHoldPoliciesIdPathParams pathParams;
    public DeleteLegalHoldPoliciesIdRequest withPathParams(DeleteLegalHoldPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}