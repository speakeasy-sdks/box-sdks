package .models.operations;



public class GetLegalHoldPolicyAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPolicyAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPolicyAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicyAssignments legalHoldPolicyAssignments;
    public GetLegalHoldPolicyAssignmentsResponse withLegalHoldPolicyAssignments(.models.shared.LegalHoldPolicyAssignments legalHoldPolicyAssignments) {
        this.legalHoldPolicyAssignments = legalHoldPolicyAssignments;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPolicyAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}