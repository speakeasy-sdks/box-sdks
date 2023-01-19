package .models.operations;


public enum PutRetentionPoliciesIdRequestBodyDispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    REMOVE_RETENTION("remove_retention");

    public final String value;

    private PutRetentionPoliciesIdRequestBodyDispositionActionEnum(String value) {
        this.value = value;
    }
}
