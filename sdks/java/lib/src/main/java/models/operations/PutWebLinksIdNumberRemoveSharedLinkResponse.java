package .models.operations;



public class PutWebLinksIdNumberRemoveSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutWebLinksIdNumberRemoveSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutWebLinksIdNumberRemoveSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutWebLinksIdNumberRemoveSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public PutWebLinksIdNumberRemoveSharedLinkResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}