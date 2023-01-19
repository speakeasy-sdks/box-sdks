package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_download")
    public Boolean canDownload;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_edit")
    public Boolean canEdit;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_preview")
    public Boolean canPreview;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions withCanPreview(Boolean canPreview) {
        this.canPreview = canPreview;
        return this;
    }
}