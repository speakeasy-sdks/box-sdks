package .models.operations;



public class DeleteLegalHoldPolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteLegalHoldPolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteLegalHoldPolicyAssignmentsIdPathParams pathParams;
    public DeleteLegalHoldPolicyAssignmentsIdRequest withPathParams(DeleteLegalHoldPolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}