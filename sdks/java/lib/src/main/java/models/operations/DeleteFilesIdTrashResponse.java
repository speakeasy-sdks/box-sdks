package .models.operations;



public class DeleteFilesIdTrashResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}