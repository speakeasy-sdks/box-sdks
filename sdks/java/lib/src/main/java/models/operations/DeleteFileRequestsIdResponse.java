package .models.operations;



public class DeleteFileRequestsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFileRequestsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFileRequestsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFileRequestsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}