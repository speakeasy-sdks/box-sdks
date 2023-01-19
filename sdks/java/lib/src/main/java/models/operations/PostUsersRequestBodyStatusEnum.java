package .models.operations;


public enum PostUsersRequestBodyStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    CANNOT_DELETE_EDIT("cannot_delete_edit"),
    CANNOT_DELETE_EDIT_UPLOAD("cannot_delete_edit_upload");

    public final String value;

    private PostUsersRequestBodyStatusEnum(String value) {
        this.value = value;
    }
}
