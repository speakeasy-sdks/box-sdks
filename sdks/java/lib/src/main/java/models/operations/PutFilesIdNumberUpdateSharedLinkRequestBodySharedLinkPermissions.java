package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_download")
    public Boolean canDownload;
    public PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_edit")
    public Boolean canEdit;
    public PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_preview")
    public Boolean canPreview;
    public PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanPreview(Boolean canPreview) {
        this.canPreview = canPreview;
        return this;
    }
}