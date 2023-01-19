package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FileSharedLinkPermissions
 * Defines if this link allows a user to preview, edit, and download an item.
 * These permissions refer to the shared link only and
 * do not supersede permissions applied to the item itself.
**/
public class FileSharedLinkPermissions {
    @JsonProperty("can_download")
    public Boolean canDownload;
    public FileSharedLinkPermissions withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }
    @JsonProperty("can_edit")
    public Boolean canEdit;
    public FileSharedLinkPermissions withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    @JsonProperty("can_preview")
    public Boolean canPreview;
    public FileSharedLinkPermissions withCanPreview(Boolean canPreview) {
        this.canPreview = canPreview;
        return this;
    }
}