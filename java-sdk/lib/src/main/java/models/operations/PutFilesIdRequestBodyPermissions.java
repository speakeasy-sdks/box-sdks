package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFilesIdRequestBodyPermissions
 * Defines who can download a file.
**/
public class PutFilesIdRequestBodyPermissions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_download")
    public PutFilesIdRequestBodyPermissionsCanDownloadEnum canDownload;
    public PutFilesIdRequestBodyPermissions withCanDownload(PutFilesIdRequestBodyPermissionsCanDownloadEnum canDownload) {
        this.canDownload = canDownload;
        return this;
    }
}