package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFolderPathCollectionTrashEntries
 * The parent folder for this item
**/
public class TrashFolderPathCollectionTrashEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFolderPathCollectionTrashEntries withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFolderPathCollectionTrashEntries withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFolderPathCollectionTrashEntries withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public String sequenceId;
    public TrashFolderPathCollectionTrashEntries withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrashFolderPathCollectionTrashEntriesTypeEnum type;
    public TrashFolderPathCollectionTrashEntries withType(TrashFolderPathCollectionTrashEntriesTypeEnum type) {
        this.type = type;
        return this;
    }
}