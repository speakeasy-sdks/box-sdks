package .models.shared;


public enum RetentionPolicyPolicyTypeEnum {
    FINITE("finite"),
    INDEFINITE("indefinite");

    public final String value;

    private RetentionPolicyPolicyTypeEnum(String value) {
        this.value = value;
    }
}
