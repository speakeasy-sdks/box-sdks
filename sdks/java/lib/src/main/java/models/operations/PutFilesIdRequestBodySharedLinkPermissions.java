package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFilesIdRequestBodySharedLinkPermissions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_download")
    public Boolean canDownload;
    public PutFilesIdRequestBodySharedLinkPermissions withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }
}