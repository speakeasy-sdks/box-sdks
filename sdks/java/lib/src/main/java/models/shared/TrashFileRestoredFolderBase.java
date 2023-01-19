package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFileRestoredFolderBase
 * The folder that this file is located within.
**/
public class TrashFileRestoredFolderBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFileRestoredFolderBase withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public TrashFileRestoredFolderBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFileRestoredFolderBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashFileRestoredFolderBase withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("type")
    public TrashFileRestoredFolderBaseTypeEnum type;
    public TrashFileRestoredFolderBase withType(TrashFileRestoredFolderBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}