package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest {
    public .models.utils.RetryConfig retries;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldPathParams pathParams;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest withPathParams(GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams queryParams;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest withQueryParams(GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}