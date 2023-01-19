package .models.operations;



public class PostFilesUploadSessionsResponse {
    public .models.shared.ClientError clientError;
    public PostFilesUploadSessionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesUploadSessionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostFilesUploadSessionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadSession uploadSession;
    public PostFilesUploadSessionsResponse withUploadSession(.models.shared.UploadSession uploadSession) {
        this.uploadSession = uploadSession;
        return this;
    }
}