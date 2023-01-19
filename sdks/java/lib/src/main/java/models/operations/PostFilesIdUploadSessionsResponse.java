package .models.operations;



public class PostFilesIdUploadSessionsResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdUploadSessionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdUploadSessionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostFilesIdUploadSessionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadSession uploadSession;
    public PostFilesIdUploadSessionsResponse withUploadSession(.models.shared.UploadSession uploadSession) {
        this.uploadSession = uploadSession;
        return this;
    }
}