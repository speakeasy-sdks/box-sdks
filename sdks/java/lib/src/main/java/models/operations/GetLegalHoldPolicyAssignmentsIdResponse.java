package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicyAssignment legalHoldPolicyAssignment;
    public GetLegalHoldPolicyAssignmentsIdResponse withLegalHoldPolicyAssignment(.models.shared.LegalHoldPolicyAssignment legalHoldPolicyAssignment) {
        this.legalHoldPolicyAssignment = legalHoldPolicyAssignment;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}