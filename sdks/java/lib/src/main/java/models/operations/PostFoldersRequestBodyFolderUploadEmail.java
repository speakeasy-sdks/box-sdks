package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostFoldersRequestBodyFolderUploadEmail
 * The Write Folder Upload Email object
**/
public class PostFoldersRequestBodyFolderUploadEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PostFoldersRequestBodyFolderUploadEmailAccessEnum access;
    public PostFoldersRequestBodyFolderUploadEmail withAccess(PostFoldersRequestBodyFolderUploadEmailAccessEnum access) {
        this.access = access;
        return this;
    }
}