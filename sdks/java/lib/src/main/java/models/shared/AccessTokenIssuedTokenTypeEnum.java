package .models.shared;


public enum AccessTokenIssuedTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token");

    public final String value;

    private AccessTokenIssuedTokenTypeEnum(String value) {
        this.value = value;
    }
}
