package .models.shared;


public enum PostOAuth2TokenSubjectTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token");

    public final String value;

    private PostOAuth2TokenSubjectTokenTypeEnum(String value) {
        this.value = value;
    }
}
