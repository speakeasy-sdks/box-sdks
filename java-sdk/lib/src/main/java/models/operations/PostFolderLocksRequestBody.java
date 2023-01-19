package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFolderLocksRequestBody {
    @JsonProperty("folder")
    public PostFolderLocksRequestBodyFolder folder;
    public PostFolderLocksRequestBody withFolder(PostFolderLocksRequestBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locked_operations")
    public PostFolderLocksRequestBodyLockedOperations lockedOperations;
    public PostFolderLocksRequestBody withLockedOperations(PostFolderLocksRequestBodyLockedOperations lockedOperations) {
        this.lockedOperations = lockedOperations;
        return this;
    }
}