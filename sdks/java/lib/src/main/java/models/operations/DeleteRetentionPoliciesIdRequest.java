package .models.operations;



public class DeleteRetentionPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteRetentionPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteRetentionPoliciesIdPathParams pathParams;
    public DeleteRetentionPoliciesIdRequest withPathParams(DeleteRetentionPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}