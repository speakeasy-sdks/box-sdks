package .models.operations;



public class PostRetentionPolicyAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public PostRetentionPolicyAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostRetentionPolicyAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicyAssignment retentionPolicyAssignment;
    public PostRetentionPolicyAssignmentsResponse withRetentionPolicyAssignment(.models.shared.RetentionPolicyAssignment retentionPolicyAssignment) {
        this.retentionPolicyAssignment = retentionPolicyAssignment;
        return this;
    }
    public Long statusCode;
    public PostRetentionPolicyAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}