package .models.shared;


public enum UserBaseTypeEnum {
    USER("user");

    public final String value;

    private UserBaseTypeEnum(String value) {
        this.value = value;
    }
}
