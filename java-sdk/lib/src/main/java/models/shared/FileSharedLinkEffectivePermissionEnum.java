package .models.shared;


public enum FileSharedLinkEffectivePermissionEnum {
    CAN_EDIT("can_edit"),
    CAN_DOWNLOAD("can_download"),
    CAN_PREVIEW("can_preview"),
    NO_ACCESS("no_access");

    public final String value;

    private FileSharedLinkEffectivePermissionEnum(String value) {
        this.value = value;
    }
}
