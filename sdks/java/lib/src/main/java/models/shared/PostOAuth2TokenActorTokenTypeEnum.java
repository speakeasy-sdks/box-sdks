package .models.shared;


public enum PostOAuth2TokenActorTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ID_TOKEN("urn:ietf:params:oauth:token-type:id_token");

    public final String value;

    private PostOAuth2TokenActorTokenTypeEnum(String value) {
        this.value = value;
    }
}
