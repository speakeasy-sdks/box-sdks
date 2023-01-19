package .models.operations;


public enum PutUsersIdRequestBodyStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    CANNOT_DELETE_EDIT("cannot_delete_edit"),
    CANNOT_DELETE_EDIT_UPLOAD("cannot_delete_edit_upload");

    public final String value;

    private PutUsersIdRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
