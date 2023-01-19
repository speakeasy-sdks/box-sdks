package .models.shared;


public enum RetentionPolicyMiniDispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    REMOVE_RETENTION("remove_retention");

    public final String value;

    private RetentionPolicyMiniDispositionActionEnum(String value) {
        this.value = value;
    }
}
