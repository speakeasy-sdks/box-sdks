package .models.operations;


public enum PutUsersIdRequestBodyRoleEnum {
    COADMIN("coadmin"),
    USER("user");

    public final String value;

    private PutUsersIdRequestBodyRoleEnum(String value) {
        this.value = value;
    }
}
