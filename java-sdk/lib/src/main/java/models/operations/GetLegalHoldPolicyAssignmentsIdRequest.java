package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsIdPathParams pathParams;
    public GetLegalHoldPolicyAssignmentsIdRequest withPathParams(GetLegalHoldPolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}