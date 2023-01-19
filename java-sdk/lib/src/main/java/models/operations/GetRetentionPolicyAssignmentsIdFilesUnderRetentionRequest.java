package .models.operations;



public class GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams pathParams;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest withPathParams(GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams queryParams;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest withQueryParams(GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}