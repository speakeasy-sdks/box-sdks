package .models.operations;



public class DeleteRetentionPolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteRetentionPolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteRetentionPolicyAssignmentsIdPathParams pathParams;
    public DeleteRetentionPolicyAssignmentsIdRequest withPathParams(DeleteRetentionPolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}