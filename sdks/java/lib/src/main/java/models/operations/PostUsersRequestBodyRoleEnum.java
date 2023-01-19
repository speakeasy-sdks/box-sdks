package .models.operations;


public enum PostUsersRequestBodyRoleEnum {
    COADMIN("coadmin"),
    USER("user");

    public final String value;

    private PostUsersRequestBodyRoleEnum(String value) {
        this.value = value;
    }
}
