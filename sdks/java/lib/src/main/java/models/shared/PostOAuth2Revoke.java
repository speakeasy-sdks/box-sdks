package .models.shared;

import .utils.SpeakeasyMetadata;

/**
 * PostOAuth2Revoke
 * A request to revoke an OAuth 2.0 token
**/
public class PostOAuth2Revoke {
    @SpeakeasyMetadata("form:name=client_id")
    public String clientId;
    public PostOAuth2Revoke withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    @SpeakeasyMetadata("form:name=client_secret")
    public String clientSecret;
    public PostOAuth2Revoke withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    @SpeakeasyMetadata("form:name=token")
    public String token;
    public PostOAuth2Revoke withToken(String token) {
        this.token = token;
        return this;
    }
}