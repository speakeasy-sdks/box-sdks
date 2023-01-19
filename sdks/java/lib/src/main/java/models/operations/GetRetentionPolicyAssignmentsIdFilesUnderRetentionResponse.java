package .models.operations;



public class GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FilesUnderRetention filesUnderRetention;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse withFilesUnderRetention(.models.shared.FilesUnderRetention filesUnderRetention) {
        this.filesUnderRetention = filesUnderRetention;
        return this;
    }
    public Long statusCode;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}