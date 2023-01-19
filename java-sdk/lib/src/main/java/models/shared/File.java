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
 * File
 * The bare basic representation of a file, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
public class File {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_created_at")
    public OffsetDateTime contentCreatedAt;
    public File withContentCreatedAt(OffsetDateTime contentCreatedAt) {
        this.contentCreatedAt = contentCreatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public File withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public File withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public File withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public File withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public File withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public FileVersionMini fileVersion;
    public File withFileVersion(FileVersionMini fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public File withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("item_status")
    public FileItemStatusEnum itemStatus;
    public File withItemStatus(FileItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public File withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonProperty("modified_by")
    public FileUserBase modifiedBy;
    public File withModifiedBy(FileUserBase modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public File withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("owned_by")
    public FileUserBase ownedBy;
    public File withOwnedBy(FileUserBase ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public FileFolderBase parent;
    public File withParent(FileFolderBase parent) {
        this.parent = parent;
        return this;
    }
    @JsonProperty("path_collection")
    public FilePathCollection pathCollection;
    public File withPathCollection(FilePathCollection pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("purged_at")
    public OffsetDateTime purgedAt;
    public File withPurgedAt(OffsetDateTime purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public File withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("sha1")
    public String sha1;
    public File withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public FileSharedLink sharedLink;
    public File withSharedLink(FileSharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonProperty("size")
    public Long size;
    public File withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("trashed_at")
    public OffsetDateTime trashedAt;
    public File withTrashedAt(OffsetDateTime trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonProperty("type")
    public FileTypeEnum type;
    public File withType(FileTypeEnum type) {
        this.type = type;
        return this;
    }
}