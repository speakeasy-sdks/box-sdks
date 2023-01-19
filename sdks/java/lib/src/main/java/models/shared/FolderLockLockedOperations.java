package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FolderLockLockedOperations
 * The operations that have been locked. Currently the `move`
 * and `delete` operations cannot be locked separately, and both need to be
 * set to `true`.
 * 
**/
public class FolderLockLockedOperations {
    @JsonProperty("delete")
    public Boolean delete;
    public FolderLockLockedOperations withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }
    @JsonProperty("move")
    public Boolean move;
    public FolderLockLockedOperations withMove(Boolean move) {
        this.move = move;
        return this;
    }
}