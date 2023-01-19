package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FolderFolderBase
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
public class FolderFolderBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public FolderFolderBase withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public FolderFolderBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public FolderFolderBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public FolderFolderBase withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("type")
    public FolderFolderBaseTypeEnum type;
    public FolderFolderBase withType(FolderFolderBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}