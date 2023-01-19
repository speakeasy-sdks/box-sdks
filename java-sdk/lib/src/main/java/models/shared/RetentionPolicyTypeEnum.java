package .models.shared;


public enum RetentionPolicyTypeEnum {
    RETENTION_POLICY("retention_policy");

    public final String value;

    private RetentionPolicyTypeEnum(String value) {
        this.value = value;
    }
}
