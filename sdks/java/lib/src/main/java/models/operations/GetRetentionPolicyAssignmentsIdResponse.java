package .models.operations;



public class GetRetentionPolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicyAssignment retentionPolicyAssignment;
    public GetRetentionPolicyAssignmentsIdResponse withRetentionPolicyAssignment(.models.shared.RetentionPolicyAssignment retentionPolicyAssignment) {
        this.retentionPolicyAssignment = retentionPolicyAssignment;
        return this;
    }
    public Long statusCode;
    public GetRetentionPolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}