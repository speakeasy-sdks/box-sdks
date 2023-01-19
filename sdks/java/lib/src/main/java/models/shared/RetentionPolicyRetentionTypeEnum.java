package .models.shared;


public enum RetentionPolicyRetentionTypeEnum {
    MODIFIABLE("modifiable"),
    NON_MODIFIABLE("non-modifiable");

    public final String value;

    private RetentionPolicyRetentionTypeEnum(String value) {
        this.value = value;
    }
}
