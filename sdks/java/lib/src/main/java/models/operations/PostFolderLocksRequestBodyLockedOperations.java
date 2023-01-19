package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFolderLocksRequestBodyLockedOperations
 * The operations to lock for the folder. If `locked_operations` is
 * included in the request, both `move` and `delete` must also be
 * included and both set to `true`.
**/
public class PostFolderLocksRequestBodyLockedOperations {
    @JsonProperty("delete")
    public Boolean delete;
    public PostFolderLocksRequestBodyLockedOperations withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }
    @JsonProperty("move")
    public Boolean move;
    public PostFolderLocksRequestBodyLockedOperations withMove(Boolean move) {
        this.move = move;
        return this;
    }
}