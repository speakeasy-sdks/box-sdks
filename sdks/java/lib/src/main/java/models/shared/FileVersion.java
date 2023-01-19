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
 * FileVersion
 * The bare basic representation of a file version, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
public class FileVersion {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public FileVersion withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public FileVersion withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public FileVersion withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modified_by")
    public UserMini modifiedBy;
    public FileVersion withModifiedBy(UserMini modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public FileVersion withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("purged_at")
    public OffsetDateTime purgedAt;
    public FileVersion withPurgedAt(OffsetDateTime purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("restored_at")
    public OffsetDateTime restoredAt;
    public FileVersion withRestoredAt(OffsetDateTime restoredAt) {
        this.restoredAt = restoredAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("restored_by")
    public UserMini restoredBy;
    public FileVersion withRestoredBy(UserMini restoredBy) {
        this.restoredBy = restoredBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sha1")
    public String sha1;
    public FileVersion withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public FileVersion withSize(Long size) {
        this.size = size;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("trashed_at")
    public OffsetDateTime trashedAt;
    public FileVersion withTrashedAt(OffsetDateTime trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trashed_by")
    public UserMini trashedBy;
    public FileVersion withTrashedBy(UserMini trashedBy) {
        this.trashedBy = trashedBy;
        return this;
    }
    @JsonProperty("type")
    public FileVersionTypeEnum type;
    public FileVersion withType(FileVersionTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploader_display_name")
    public String uploaderDisplayName;
    public FileVersion withUploaderDisplayName(String uploaderDisplayName) {
        this.uploaderDisplayName = uploaderDisplayName;
        return this;
    }
}