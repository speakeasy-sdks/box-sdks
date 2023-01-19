package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashWebLinkPathCollectionTrashEntries
 * The parent folder for this item
**/
public class TrashWebLinkPathCollectionTrashEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashWebLinkPathCollectionTrashEntries withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashWebLinkPathCollectionTrashEntries withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashWebLinkPathCollectionTrashEntries withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public String sequenceId;
    public TrashWebLinkPathCollectionTrashEntries withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrashWebLinkPathCollectionTrashEntriesTypeEnum type;
    public TrashWebLinkPathCollectionTrashEntries withType(TrashWebLinkPathCollectionTrashEntriesTypeEnum type) {
        this.type = type;
        return this;
    }
}