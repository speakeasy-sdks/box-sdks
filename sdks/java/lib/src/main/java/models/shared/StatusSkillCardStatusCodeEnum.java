package .models.shared;


public enum StatusSkillCardStatusCodeEnum {
    INVOKED("invoked"),
    PROCESSING("processing"),
    SUCCESS("success"),
    TRANSIENT_FAILURE("transient_failure"),
    PERMANENT_FAILURE("permanent_failure");

    public final String value;

    private StatusSkillCardStatusCodeEnum(String value) {
        this.value = value;
    }
}
