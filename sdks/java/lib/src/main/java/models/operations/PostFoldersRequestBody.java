package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFoldersRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_upload_email")
    public PostFoldersRequestBodyFolderUploadEmail folderUploadEmail;
    public PostFoldersRequestBody withFolderUploadEmail(PostFoldersRequestBodyFolderUploadEmail folderUploadEmail) {
        this.folderUploadEmail = folderUploadEmail;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostFoldersRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent")
    public PostFoldersRequestBodyParent parent;
    public PostFoldersRequestBody withParent(PostFoldersRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sync_state")
    public PostFoldersRequestBodySyncStateEnum syncState;
    public PostFoldersRequestBody withSyncState(PostFoldersRequestBodySyncStateEnum syncState) {
        this.syncState = syncState;
        return this;
    }
}