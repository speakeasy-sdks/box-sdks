package .models.shared;


public enum RetentionPolicyStatusEnum {
    ACTIVE("active"),
    RETIRED("retired");

    public final String value;

    private RetentionPolicyStatusEnum(String value) {
        this.value = value;
    }
}
