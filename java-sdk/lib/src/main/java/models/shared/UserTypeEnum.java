package .models.shared;


public enum UserTypeEnum {
    USER("user");

    public final String value;

    private UserTypeEnum(String value) {
        this.value = value;
    }
}
