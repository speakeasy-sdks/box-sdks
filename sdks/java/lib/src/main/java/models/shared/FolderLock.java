package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * FolderLock
 * Folder locks define access restrictions placed by folder owners
 * to prevent specific folders from being moved or deleted.
**/
public class FolderLock {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public FolderLock withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserBase createdBy;
    public FolderLock withCreatedBy(UserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder")
    public FolderMini folder;
    public FolderLock withFolder(FolderMini folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FolderLock withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lock_type")
    public String lockType;
    public FolderLock withLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locked_operations")
    public FolderLockLockedOperations lockedOperations;
    public FolderLock withLockedOperations(FolderLockLockedOperations lockedOperations) {
        this.lockedOperations = lockedOperations;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public FolderLock withType(String type) {
        this.type = type;
        return this;
    }
}