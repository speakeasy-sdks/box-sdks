package .models.operations;



public class DeleteFoldersIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFoldersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFoldersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFoldersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}