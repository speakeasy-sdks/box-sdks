package .models.shared;


public enum RetentionPolicyAssignmentAssignedToTypeEnum {
    FOLDER("folder"),
    ENTERPRISE("enterprise"),
    METADATA_TEMPLATE("metadata_template");

    public final String value;

    private RetentionPolicyAssignmentAssignedToTypeEnum(String value) {
        this.value = value;
    }
}
