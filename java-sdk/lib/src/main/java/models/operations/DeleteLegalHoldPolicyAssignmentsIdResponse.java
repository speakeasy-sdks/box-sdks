package .models.operations;



public class DeleteLegalHoldPolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteLegalHoldPolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteLegalHoldPolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteLegalHoldPolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}