package .models.shared;


public enum PostOAuth2TokenBoxSubjectTypeEnum {
    ENTERPRISE("enterprise"),
    USER("user");

    public final String value;

    private PostOAuth2TokenBoxSubjectTypeEnum(String value) {
        this.value = value;
    }
}
