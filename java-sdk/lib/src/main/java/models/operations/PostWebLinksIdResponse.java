package .models.operations;



public class PostWebLinksIdResponse {
    public .models.shared.ClientError clientError;
    public PostWebLinksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostWebLinksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostWebLinksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashWebLinkRestored trashWebLinkRestored;
    public PostWebLinksIdResponse withTrashWebLinkRestored(.models.shared.TrashWebLinkRestored trashWebLinkRestored) {
        this.trashWebLinkRestored = trashWebLinkRestored;
        return this;
    }
}