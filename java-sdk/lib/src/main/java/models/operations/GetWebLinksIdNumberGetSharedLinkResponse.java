package .models.operations;



public class GetWebLinksIdNumberGetSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public GetWebLinksIdNumberGetSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetWebLinksIdNumberGetSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetWebLinksIdNumberGetSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public GetWebLinksIdNumberGetSharedLinkResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}