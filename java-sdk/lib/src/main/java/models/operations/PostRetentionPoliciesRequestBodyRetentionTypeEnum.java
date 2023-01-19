package .models.operations;


public enum PostRetentionPoliciesRequestBodyRetentionTypeEnum {
    MODIFIABLE("modifiable"),
    NON_MODIFIABLE("non-modifiable");

    public final String value;

    private PostRetentionPoliciesRequestBodyRetentionTypeEnum(String value) {
        this.value = value;
    }
}
