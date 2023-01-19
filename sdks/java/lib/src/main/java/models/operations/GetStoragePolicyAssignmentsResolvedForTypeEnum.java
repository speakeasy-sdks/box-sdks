package .models.operations;


public enum GetStoragePolicyAssignmentsResolvedForTypeEnum {
    USER("user"),
    ENTERPRISE("enterprise");

    public final String value;

    private GetStoragePolicyAssignmentsResolvedForTypeEnum(String value) {
        this.value = value;
    }
}
