package .models.operations;



public class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams pathParams;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest withPathParams(GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams queryParams;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest withQueryParams(GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}