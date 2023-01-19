package .models.operations;



public class GetRetentionPoliciesIdAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPoliciesIdAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPoliciesIdAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicyAssignments retentionPolicyAssignments;
    public GetRetentionPoliciesIdAssignmentsResponse withRetentionPolicyAssignments(.models.shared.RetentionPolicyAssignments retentionPolicyAssignments) {
        this.retentionPolicyAssignments = retentionPolicyAssignments;
        return this;
    }
    public Long statusCode;
    public GetRetentionPoliciesIdAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}