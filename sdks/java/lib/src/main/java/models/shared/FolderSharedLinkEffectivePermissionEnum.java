package .models.shared;


public enum FolderSharedLinkEffectivePermissionEnum {
    CAN_EDIT("can_edit"),
    CAN_DOWNLOAD("can_download"),
    CAN_PREVIEW("can_preview"),
    NO_ACCESS("no_access");

    public final String value;

    private FolderSharedLinkEffectivePermissionEnum(String value) {
        this.value = value;
    }
}
