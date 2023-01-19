package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFolderFolderBase
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
public class TrashFolderFolderBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public TrashFolderFolderBase withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public TrashFolderFolderBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrashFolderFolderBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public TrashFolderFolderBase withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("type")
    public TrashFolderFolderBaseTypeEnum type;
    public TrashFolderFolderBase withType(TrashFolderFolderBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}