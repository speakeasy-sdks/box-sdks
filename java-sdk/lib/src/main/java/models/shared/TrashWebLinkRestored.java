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
 * TrashWebLinkRestored
 * Represents a web link restored from the trash.
**/
public class TrashWebLinkRestored {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TrashWebLinkRestored withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public TrashWebLinkRestored withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public TrashWebLinkRestored withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashWebLinkRestored withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashWebLinkRestored withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_status")
    public TrashWebLinkRestoredItemStatusEnum itemStatus;
    public TrashWebLinkRestored withItemStatus(TrashWebLinkRestoredItemStatusEnum itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public TrashWebLinkRestored withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modified_by")
    public UserMini modifiedBy;
    public TrashWebLinkRestored withModifiedBy(UserMini modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashWebLinkRestored withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owned_by")
    public UserMini ownedBy;
    public TrashWebLinkRestored withOwnedBy(UserMini ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public FolderMini parent;
    public TrashWebLinkRestored withParent(FolderMini parent) {
        this.parent = parent;
        return this;
    }
    @JsonProperty("path_collection")
    public TrashWebLinkRestoredPathCollection pathCollection;
    public TrashWebLinkRestored withPathCollection(TrashWebLinkRestoredPathCollection pathCollection) {
        this.pathCollection = pathCollection;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purged_at")
    public String purgedAt;
    public TrashWebLinkRestored withPurgedAt(String purgedAt) {
        this.purgedAt = purgedAt;
        return this;
    }
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashWebLinkRestored withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public String sharedLink;
    public TrashWebLinkRestored withSharedLink(String sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trashed_at")
    public String trashedAt;
    public TrashWebLinkRestored withTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrashWebLinkRestoredTypeEnum type;
    public TrashWebLinkRestored withType(TrashWebLinkRestoredTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;
    public TrashWebLinkRestored withUrl(String url) {
        this.url = url;
        return this;
    }
}