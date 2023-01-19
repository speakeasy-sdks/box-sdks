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
 * TrashFolderRestored
 * Represents a folder restored from the trash.
**/
public class TrashFolderRestored {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_created_at")
    public OffsetDateTime contentCreatedAt;
    public TrashFolderRestored withContentCreatedAt(OffsetDateTime contentCreatedAt) {
        this.contentCreatedAt = contentCreatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public TrashFolderRestored withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TrashFolderRestored withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public TrashFolderRestoredUserBase createdBy;
    public TrashFolderRestored withCreatedBy(TrashFolderRestoredUserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public java.util.Map<String, Object> description;
    public TrashFolderRestored withDescription(java.util.Map<String, Object> description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFolderRestored withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_upload_email")
    public String folderUploadEmail;
    public TrashFolderRestored withFolderUploadEmail(String folderUploadEmail) {
        this.folderUploadEmail = folderUploadEmail;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFolderRestored withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_status")
    public TrashFolderRestoredItemStatusEnum itemStatus;
    public TrashFolderRestored withItemStatus(TrashFolderRestoredItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public TrashFolderRestored withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modified_by")
    public TrashFolderRestoredUserBase modifiedBy;
    public TrashFolderRestored withModifiedBy(TrashFolderRestoredUserBase modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFolderRestored withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owned_by")
    public TrashFolderRestoredUserBase ownedBy;
    public TrashFolderRestored withOwnedBy(TrashFolderRestoredUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public TrashFolderRestoredFolderBase parent;
    public TrashFolderRestored withParent(TrashFolderRestoredFolderBase parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path_collection")
    public TrashFolderRestoredPathCollection pathCollection;
    public TrashFolderRestored withPathCollection(TrashFolderRestoredPathCollection pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purged_at")
    public String purgedAt;
    public TrashFolderRestored withPurgedAt(String purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashFolderRestored withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public String sharedLink;
    public TrashFolderRestored withSharedLink(String sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public TrashFolderRestored withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trashed_at")
    public String trashedAt;
    public TrashFolderRestored withTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrashFolderRestoredTypeEnum type;
    public TrashFolderRestored withType(TrashFolderRestoredTypeEnum type) {
        this.type = type;
        return this;
    }
}