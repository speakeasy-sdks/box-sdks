package .models.operations;


public enum PostGroupMembershipsRequestBodyRoleEnum {
    MEMBER("member"),
    ADMIN("admin");

    public final String value;

    private PostGroupMembershipsRequestBodyRoleEnum(String value) {
        this.value = value;
    }
}
