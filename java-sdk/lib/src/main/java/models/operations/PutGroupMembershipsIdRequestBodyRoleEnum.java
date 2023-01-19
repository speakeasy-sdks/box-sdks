package .models.operations;


public enum PutGroupMembershipsIdRequestBodyRoleEnum {
    MEMBER("member"),
    ADMIN("admin");

    public final String value;

    private PutGroupMembershipsIdRequestBodyRoleEnum(String value) {
        this.value = value;
    }
}
