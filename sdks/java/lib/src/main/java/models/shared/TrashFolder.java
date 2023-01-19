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
 * TrashFolder
 * Represents a trashed folder.
**/
public class TrashFolder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_created_at")
    public OffsetDateTime contentCreatedAt;
    public TrashFolder withContentCreatedAt(OffsetDateTime contentCreatedAt) {
        this.contentCreatedAt = contentCreatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public TrashFolder withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TrashFolder withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("created_by")
    public TrashFolderUserBase createdBy;
    public TrashFolder withCreatedBy(TrashFolderUserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonProperty("description")
    public java.util.Map<String, Object> description;
    public TrashFolder withDescription(java.util.Map<String, Object> description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFolder withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_upload_email")
    public String folderUploadEmail;
    public TrashFolder withFolderUploadEmail(String folderUploadEmail) {
        this.folderUploadEmail = folderUploadEmail;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public TrashFolder withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("item_status")
    public TrashFolderItemStatusEnum itemStatus;
    public TrashFolder withItemStatus(TrashFolderItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public TrashFolder withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonProperty("modified_by")
    public TrashFolderUserBase modifiedBy;
    public TrashFolder withModifiedBy(TrashFolderUserBase modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TrashFolder withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("owned_by")
    public TrashFolderUserBase ownedBy;
    public TrashFolder withOwnedBy(TrashFolderUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public TrashFolderFolderBase parent;
    public TrashFolder withParent(TrashFolderFolderBase parent) {
        this.parent = parent;
        return this;
    }
    @JsonProperty("path_collection")
    public TrashFolderPathCollectionTrash pathCollection;
    public TrashFolder withPathCollection(TrashFolderPathCollectionTrash pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("purged_at")
    public OffsetDateTime purgedAt;
    public TrashFolder withPurgedAt(OffsetDateTime purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashFolder withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public String sharedLink;
    public TrashFolder withSharedLink(String sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonProperty("size")
    public Long size;
    public TrashFolder withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("trashed_at")
    public OffsetDateTime trashedAt;
    public TrashFolder withTrashedAt(OffsetDateTime trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonProperty("type")
    public TrashFolderTypeEnum type;
    public TrashFolder withType(TrashFolderTypeEnum type) {
        this.type = type;
        return this;
    }
}