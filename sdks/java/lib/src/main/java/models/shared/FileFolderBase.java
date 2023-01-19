package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileFolderBase
 * The folder that this file is located within.
**/
public class FileFolderBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public FileFolderBase withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public FileFolderBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public FileFolderBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public FileFolderBase withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("type")
    public FileFolderBaseTypeEnum type;
    public FileFolderBase withType(FileFolderBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}