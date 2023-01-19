package .models.shared;


public enum AccessTokenTokenTypeEnum {
    BEARER("bearer");

    public final String value;

    private AccessTokenTokenTypeEnum(String value) {
        this.value = value;
    }
}
