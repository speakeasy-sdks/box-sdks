package .models.operations;


public enum PutSkillInvocationsIdRequestBodyStatusEnum {
    INVOKED("invoked"),
    PROCESSING("processing"),
    SUCCESS("success"),
    TRANSIENT_FAILURE("transient_failure"),
    PERMANENT_FAILURE("permanent_failure");

    public final String value;

    private PutSkillInvocationsIdRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
