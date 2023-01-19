package .models.operations;



public class GetRetentionPoliciesIdAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public GetRetentionPoliciesIdAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRetentionPoliciesIdAssignmentsPathParams pathParams;
    public GetRetentionPoliciesIdAssignmentsRequest withPathParams(GetRetentionPoliciesIdAssignmentsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetRetentionPoliciesIdAssignmentsQueryParams queryParams;
    public GetRetentionPoliciesIdAssignmentsRequest withQueryParams(GetRetentionPoliciesIdAssignmentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}