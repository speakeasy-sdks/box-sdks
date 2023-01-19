package .models.operations;



public class PostFilesContentResponse {
    public .models.shared.ClientError clientError;
    public PostFilesContentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Files files;
    public PostFilesContentResponse withFiles(.models.shared.Files files) {
        this.files = files;
        return this;
    }
    public Long statusCode;
    public PostFilesContentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}