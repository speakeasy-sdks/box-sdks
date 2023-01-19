package .models.operations;



public class PostWebLinksResponse {
    public .models.shared.ClientError clientError;
    public PostWebLinksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostWebLinksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostWebLinksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.WebLink webLink;
    public PostWebLinksResponse withWebLink(.models.shared.WebLink webLink) {
        this.webLink = webLink;
        return this;
    }
}