package .models.operations;



public class PutFileRequestsIdResponse {
    public .models.shared.ClientError clientError;
    public PutFileRequestsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFileRequestsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileRequest fileRequest;
    public PutFileRequestsIdResponse withFileRequest(.models.shared.FileRequest fileRequest) {
        this.fileRequest = fileRequest;
        return this;
    }
    public Long statusCode;
    public PutFileRequestsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}