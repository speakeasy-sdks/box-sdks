package .models.shared;


public enum PostOAuth2TokenRefreshAccessTokenGrantTypeEnum {
    REFRESH_TOKEN("refresh_token");

    public final String value;

    private PostOAuth2TokenRefreshAccessTokenGrantTypeEnum(String value) {
        this.value = value;
    }
}
