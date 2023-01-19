package .models.operations;



public class PostFileRequestsIdCopyResponse {
    public .models.shared.ClientError clientError;
    public PostFileRequestsIdCopyResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFileRequestsIdCopyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileRequest fileRequest;
    public PostFileRequestsIdCopyResponse withFileRequest(.models.shared.FileRequest fileRequest) {
        this.fileRequest = fileRequest;
        return this;
    }
    public Long statusCode;
    public PostFileRequestsIdCopyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}