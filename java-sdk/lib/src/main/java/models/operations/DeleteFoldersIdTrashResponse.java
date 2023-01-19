package .models.operations;



public class DeleteFoldersIdTrashResponse {
    public .models.shared.ClientError clientError;
    public DeleteFoldersIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFoldersIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFoldersIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}