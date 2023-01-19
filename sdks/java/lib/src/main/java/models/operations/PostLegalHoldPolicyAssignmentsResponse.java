package .models.operations;



public class PostLegalHoldPolicyAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public PostLegalHoldPolicyAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostLegalHoldPolicyAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicyAssignment legalHoldPolicyAssignment;
    public PostLegalHoldPolicyAssignmentsResponse withLegalHoldPolicyAssignment(.models.shared.LegalHoldPolicyAssignment legalHoldPolicyAssignment) {
        this.legalHoldPolicyAssignment = legalHoldPolicyAssignment;
        return this;
    }
    public Long statusCode;
    public PostLegalHoldPolicyAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}