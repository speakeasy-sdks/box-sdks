package .models.operations;



public class GetSharedItemsNumberWebLinksResponse {
    public .models.shared.ClientError clientError;
    public GetSharedItemsNumberWebLinksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetSharedItemsNumberWebLinksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetSharedItemsNumberWebLinksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public GetSharedItemsNumberWebLinksResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}