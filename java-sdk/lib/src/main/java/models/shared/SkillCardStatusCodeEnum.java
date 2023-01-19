package .models.shared;


public enum SkillCardStatusCodeEnum {
    INVOKED("invoked"),
    PROCESSING("processing"),
    SUCCESS("success"),
    TRANSIENT_FAILURE("transient_failure"),
    PERMANENT_FAILURE("permanent_failure");

    public final String value;

    private SkillCardStatusCodeEnum(String value) {
        this.value = value;
    }
}
