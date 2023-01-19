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
 * TrashFileRestored
 * Represents a file restored from the trash.
**/
public class TrashFileRestored {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_created_at")
    public OffsetDateTime contentCreatedAt;
    public TrashFileRestored withContentCreatedAt(OffsetDateTime contentCreatedAt) {
        this.contentCreatedAt = contentCreatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public TrashFileRestored withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TrashFileRestored withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public TrashFileRestored withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public TrashFileRestored withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFileRestored withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public FileVersionMini fileVersion;
    public TrashFileRestored withFileVersion(FileVersionMini fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public TrashFileRestored withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("item_status")
    public TrashFileRestoredItemStatusEnum itemStatus;
    public TrashFileRestored withItemStatus(TrashFileRestoredItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public TrashFileRestored withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonProperty("modified_by")
    public TrashFileRestoredUserBase modifiedBy;
    public TrashFileRestored withModifiedBy(TrashFileRestoredUserBase modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFileRestored withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("owned_by")
    public TrashFileRestoredUserBase ownedBy;
    public TrashFileRestored withOwnedBy(TrashFileRestoredUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public TrashFileRestoredFolderBase parent;
    public TrashFileRestored withParent(TrashFileRestoredFolderBase parent) {
        this.parent = parent;
        return this;
    }
    @JsonProperty("path_collection")
    public TrashFileRestoredPathCollection pathCollection;
    public TrashFileRestored withPathCollection(TrashFileRestoredPathCollection pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purged_at")
    public String purgedAt;
    public TrashFileRestored withPurgedAt(String purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashFileRestored withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("sha1")
    public String sha1;
    public TrashFileRestored withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public String sharedLink;
    public TrashFileRestored withSharedLink(String sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonProperty("size")
    public Long size;
    public TrashFileRestored withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trashed_at")
    public String trashedAt;
    public TrashFileRestored withTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonProperty("type")
    public TrashFileRestoredTypeEnum type;
    public TrashFileRestored withType(TrashFileRestoredTypeEnum type) {
        this.type = type;
        return this;
    }
}