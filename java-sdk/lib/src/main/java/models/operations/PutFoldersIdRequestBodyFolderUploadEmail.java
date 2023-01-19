package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFoldersIdRequestBodyFolderUploadEmail
 * The Write Folder Upload Email object
**/
public class PutFoldersIdRequestBodyFolderUploadEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutFoldersIdRequestBodyFolderUploadEmailAccessEnum access;
    public PutFoldersIdRequestBodyFolderUploadEmail withAccess(PutFoldersIdRequestBodyFolderUploadEmailAccessEnum access) {
        this.access = access;
        return this;
    }
}