package .models.operations;



public class DeleteFilesIdVersionsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesIdVersionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesIdVersionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesIdVersionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}