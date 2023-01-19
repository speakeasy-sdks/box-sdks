package .models.operations;



public class DeleteWebLinksIdTrashResponse {
    public .models.shared.ClientError clientError;
    public DeleteWebLinksIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteWebLinksIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteWebLinksIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}