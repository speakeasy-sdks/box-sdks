package .models.operations;


public enum GetRetentionPoliciesPolicyTypeEnum {
    FINITE("finite"),
    INDEFINITE("indefinite");

    public final String value;

    private GetRetentionPoliciesPolicyTypeEnum(String value) {
        this.value = value;
    }
}
