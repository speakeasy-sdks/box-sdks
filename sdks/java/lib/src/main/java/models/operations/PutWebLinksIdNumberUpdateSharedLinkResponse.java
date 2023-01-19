package .models.operations;



public class PutWebLinksIdNumberUpdateSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutWebLinksIdNumberUpdateSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutWebLinksIdNumberUpdateSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutWebLinksIdNumberUpdateSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public PutWebLinksIdNumberUpdateSharedLinkResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}