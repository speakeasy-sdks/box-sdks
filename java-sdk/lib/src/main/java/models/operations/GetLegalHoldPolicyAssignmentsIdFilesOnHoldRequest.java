package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams pathParams;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest withPathParams(GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldQueryParams queryParams;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest withQueryParams(GetLegalHoldPolicyAssignmentsIdFilesOnHoldQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}