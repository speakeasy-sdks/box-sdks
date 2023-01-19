package .models.operations;



public class GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionLegalHolds fileVersionLegalHolds;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse withFileVersionLegalHolds(.models.shared.FileVersionLegalHolds fileVersionLegalHolds) {
        this.fileVersionLegalHolds = fileVersionLegalHolds;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}