package .models.operations;



public class DeleteFilesUploadSessionsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesUploadSessionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesUploadSessionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesUploadSessionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}