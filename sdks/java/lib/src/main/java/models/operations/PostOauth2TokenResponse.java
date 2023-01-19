package .models.operations;



public class PostOauth2TokenResponse {
    public .models.shared.AccessToken accessToken;
    public PostOauth2TokenResponse withAccessToken(.models.shared.AccessToken accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String contentType;
    public PostOauth2TokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.OAuth2Error oAuth2Error;
    public PostOauth2TokenResponse withOAuth2Error(.models.shared.OAuth2Error oAuth2Error) {
        this.oAuth2Error = oAuth2Error;
        return this;
    }
    public Long statusCode;
    public PostOauth2TokenResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}