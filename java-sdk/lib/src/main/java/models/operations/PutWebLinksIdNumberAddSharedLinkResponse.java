package .models.operations;



public class PutWebLinksIdNumberAddSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutWebLinksIdNumberAddSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutWebLinksIdNumberAddSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutWebLinksIdNumberAddSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public PutWebLinksIdNumberAddSharedLinkResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}