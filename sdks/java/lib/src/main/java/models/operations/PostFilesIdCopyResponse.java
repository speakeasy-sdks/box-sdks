package .models.operations;



public class PostFilesIdCopyResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdCopyResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdCopyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public PostFilesIdCopyResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public PostFilesIdCopyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}