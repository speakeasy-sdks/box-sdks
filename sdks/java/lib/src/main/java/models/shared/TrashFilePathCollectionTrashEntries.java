package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFilePathCollectionTrashEntries
 * The parent folder for this item
**/
public class TrashFilePathCollectionTrashEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFilePathCollectionTrashEntries withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFilePathCollectionTrashEntries withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFilePathCollectionTrashEntries withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public String sequenceId;
    public TrashFilePathCollectionTrashEntries withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrashFilePathCollectionTrashEntriesTypeEnum type;
    public TrashFilePathCollectionTrashEntries withType(TrashFilePathCollectionTrashEntriesTypeEnum type) {
        this.type = type;
        return this;
    }
}