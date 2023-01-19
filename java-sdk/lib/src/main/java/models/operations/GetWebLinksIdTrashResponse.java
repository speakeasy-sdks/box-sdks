package .models.operations;



public class GetWebLinksIdTrashResponse {
    public .models.shared.ClientError clientError;
    public GetWebLinksIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetWebLinksIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetWebLinksIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashWebLink trashWebLink;
    public GetWebLinksIdTrashResponse withTrashWebLink(.models.shared.TrashWebLink trashWebLink) {
        this.trashWebLink = trashWebLink;
        return this;
    }
}