package .models.operations;


public enum PostRetentionPoliciesRequestBodyDispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    REMOVE_RETENTION("remove_retention");

    public final String value;

    private PostRetentionPoliciesRequestBodyDispositionActionEnum(String value) {
        this.value = value;
    }
}
