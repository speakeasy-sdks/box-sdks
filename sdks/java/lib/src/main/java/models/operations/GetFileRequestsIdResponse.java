package .models.operations;



public class GetFileRequestsIdResponse {
    public .models.shared.ClientError clientError;
    public GetFileRequestsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFileRequestsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileRequest fileRequest;
    public GetFileRequestsIdResponse withFileRequest(.models.shared.FileRequest fileRequest) {
        this.fileRequest = fileRequest;
        return this;
    }
    public Long statusCode;
    public GetFileRequestsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}