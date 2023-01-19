package .models.operations;



public class GetRetentionPolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdPathParams pathParams;
    public GetRetentionPolicyAssignmentsIdRequest withPathParams(GetRetentionPolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetRetentionPolicyAssignmentsIdQueryParams queryParams;
    public GetRetentionPolicyAssignmentsIdRequest withQueryParams(GetRetentionPolicyAssignmentsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}