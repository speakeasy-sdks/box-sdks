package .models.operations;


public enum PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum {
    USER("user"),
    ENTERPRISE("enterprise");

    public final String value;

    private PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum(String value) {
        this.value = value;
    }
}
