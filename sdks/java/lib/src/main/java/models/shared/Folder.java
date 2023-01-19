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
 * Folder
 * The bare basic representation of a folder, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
public class Folder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_created_at")
    public OffsetDateTime contentCreatedAt;
    public Folder withContentCreatedAt(OffsetDateTime contentCreatedAt) {
        this.contentCreatedAt = contentCreatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public Folder withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Folder withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("created_by")
    public FolderUserBase createdBy;
    public Folder withCreatedBy(FolderUserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public java.util.Map<String, Object> description;
    public Folder withDescription(java.util.Map<String, Object> description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public Folder withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_upload_email")
    public FolderFolderUploadEmail folderUploadEmail;
    public Folder withFolderUploadEmail(FolderFolderUploadEmail folderUploadEmail) {
        this.folderUploadEmail = folderUploadEmail;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public Folder withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("item_collection")
    public FolderItems itemCollection;
    public Folder withItemCollection(FolderItems itemCollection) {
        this.itemCollection = itemCollection;
        return this;
    }
    @JsonProperty("item_status")
    public FolderItemStatusEnum itemStatus;
    public Folder withItemStatus(FolderItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public Folder withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonProperty("modified_by")
    public FolderUserBase modifiedBy;
    public Folder withModifiedBy(FolderUserBase modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public Folder withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("owned_by")
    public FolderUserBase ownedBy;
    public Folder withOwnedBy(FolderUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public FolderFolderBase parent;
    public Folder withParent(FolderFolderBase parent) {
        this.parent = parent;
        return this;
    }
    @JsonProperty("path_collection")
    public FolderPathCollection pathCollection;
    public Folder withPathCollection(FolderPathCollection pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("purged_at")
    public OffsetDateTime purgedAt;
    public Folder withPurgedAt(OffsetDateTime purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public Folder withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public FolderSharedLink sharedLink;
    public Folder withSharedLink(FolderSharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonProperty("size")
    public Long size;
    public Folder withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("trashed_at")
    public OffsetDateTime trashedAt;
    public Folder withTrashedAt(OffsetDateTime trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonProperty("type")
    public FolderTypeEnum type;
    public Folder withType(FolderTypeEnum type) {
        this.type = type;
        return this;
    }
}