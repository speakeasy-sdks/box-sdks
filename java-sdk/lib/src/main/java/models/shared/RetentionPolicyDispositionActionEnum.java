package .models.shared;


public enum RetentionPolicyDispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    REMOVE_RETENTION("remove_retention");

    public final String value;

    private RetentionPolicyDispositionActionEnum(String value) {
        this.value = value;
    }
}
