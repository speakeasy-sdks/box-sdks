package .models.operations;



public class PostOauth2TokenNumberRefreshResponse {
    public .models.shared.AccessToken accessToken;
    public PostOauth2TokenNumberRefreshResponse withAccessToken(.models.shared.AccessToken accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String contentType;
    public PostOauth2TokenNumberRefreshResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.OAuth2Error oAuth2Error;
    public PostOauth2TokenNumberRefreshResponse withOAuth2Error(.models.shared.OAuth2Error oAuth2Error) {
        this.oAuth2Error = oAuth2Error;
        return this;
    }
    public Long statusCode;
    public PostOauth2TokenNumberRefreshResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}