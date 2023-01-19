package .models.operations;



public class DeleteRetentionPolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteRetentionPolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteRetentionPolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteRetentionPolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}