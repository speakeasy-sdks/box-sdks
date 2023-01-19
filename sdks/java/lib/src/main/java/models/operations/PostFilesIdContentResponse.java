package .models.operations;



public class PostFilesIdContentResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdContentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Files files;
    public PostFilesIdContentResponse withFiles(.models.shared.Files files) {
        this.files = files;
        return this;
    }
    public Long statusCode;
    public PostFilesIdContentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}