package .models.shared;


public enum PostOAuth2TokenGrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token"),
    CLIENT_CREDENTIALS("client_credentials"),
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_JWT_BEARER("urn:ietf:params:oauth:grant-type:jwt-bearer"),
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_TOKEN_EXCHANGE("urn:ietf:params:oauth:grant-type:token-exchange");

    public final String value;

    private PostOAuth2TokenGrantTypeEnum(String value) {
        this.value = value;
    }
}
