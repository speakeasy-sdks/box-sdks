package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionLegalHolds fileVersionLegalHolds;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse withFileVersionLegalHolds(.models.shared.FileVersionLegalHolds fileVersionLegalHolds) {
        this.fileVersionLegalHolds = fileVersionLegalHolds;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}