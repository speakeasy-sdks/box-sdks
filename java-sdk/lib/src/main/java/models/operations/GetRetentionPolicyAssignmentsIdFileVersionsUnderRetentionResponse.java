package .models.operations;



public class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FilesUnderRetention filesUnderRetention;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse withFilesUnderRetention(.models.shared.FilesUnderRetention filesUnderRetention) {
        this.filesUnderRetention = filesUnderRetention;
        return this;
    }
    public Long statusCode;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}