package .models.shared;


public enum UserStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    CANNOT_DELETE_EDIT("cannot_delete_edit"),
    CANNOT_DELETE_EDIT_UPLOAD("cannot_delete_edit_upload");

    public final String value;

    private UserStatusEnum(String value) {
        this.value = value;
    }
}
