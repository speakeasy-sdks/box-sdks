package .models.operations;


public enum GetLegalHoldPolicyAssignmentsAssignToTypeEnum {
    FILE("file"),
    FILE_VERSION("file_version"),
    FOLDER("folder"),
    USER("user");

    public final String value;

    private GetLegalHoldPolicyAssignmentsAssignToTypeEnum(String value) {
        this.value = value;
    }
}
