package .models.operations;


public enum PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum {
    FILE("file"),
    FILE_VERSION("file_version"),
    FOLDER("folder"),
    USER("user");

    public final String value;

    private PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum(String value) {
        this.value = value;
    }
}
