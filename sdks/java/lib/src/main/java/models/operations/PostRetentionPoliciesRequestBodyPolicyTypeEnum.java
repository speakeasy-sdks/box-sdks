package .models.operations;


public enum PostRetentionPoliciesRequestBodyPolicyTypeEnum {
    FINITE("finite"),
    INDEFINITE("indefinite");

    public final String value;

    private PostRetentionPoliciesRequestBodyPolicyTypeEnum(String value) {
        this.value = value;
    }
}
