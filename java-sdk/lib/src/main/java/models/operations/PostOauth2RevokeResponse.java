package .models.operations;



public class PostOauth2RevokeResponse {
    public String contentType;
    public PostOauth2RevokeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.OAuth2Error oAuth2Error;
    public PostOauth2RevokeResponse withOAuth2Error(.models.shared.OAuth2Error oAuth2Error) {
        this.oAuth2Error = oAuth2Error;
        return this;
    }
    public Long statusCode;
    public PostOauth2RevokeResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}