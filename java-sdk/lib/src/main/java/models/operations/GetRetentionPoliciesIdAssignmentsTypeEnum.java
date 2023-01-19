package .models.operations;


public enum GetRetentionPoliciesIdAssignmentsTypeEnum {
    FOLDER("folder"),
    ENTERPRISE("enterprise"),
    METADATA_TEMPLATE("metadata_template");

    public final String value;

    private GetRetentionPoliciesIdAssignmentsTypeEnum(String value) {
        this.value = value;
    }
}
