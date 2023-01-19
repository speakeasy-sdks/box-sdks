package .models.operations;


public enum PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum {
    ENTERPRISE("enterprise"),
    FOLDER("folder"),
    METADATA_TEMPLATE("metadata_template");

    public final String value;

    private PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum(String value) {
        this.value = value;
    }
}
