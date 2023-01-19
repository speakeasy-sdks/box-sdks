package .models.shared;

import .utils.SpeakeasyMetadata;

/**
 * PostOAuth2TokenRefreshAccessToken
 * A request to refresh an Access Token. Use this API to refresh an expired
 * Access Token using a valid Refresh Token.
**/
public class PostOAuth2TokenRefreshAccessToken {
    @SpeakeasyMetadata("form:name=client_id")
    public String clientId;
    public PostOAuth2TokenRefreshAccessToken withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    @SpeakeasyMetadata("form:name=client_secret")
    public String clientSecret;
    public PostOAuth2TokenRefreshAccessToken withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    @SpeakeasyMetadata("form:name=grant_type")
    public PostOAuth2TokenRefreshAccessTokenGrantTypeEnum grantType;
    public PostOAuth2TokenRefreshAccessToken withGrantType(PostOAuth2TokenRefreshAccessTokenGrantTypeEnum grantType) {
        this.grantType = grantType;
        return this;
    }
    @SpeakeasyMetadata("form:name=refresh_token")
    public String refreshToken;
    public PostOAuth2TokenRefreshAccessToken withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
}