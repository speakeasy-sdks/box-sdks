package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody
 * An operation that replaces an existing card.
**/
public class PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("op")
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequestBodyOpEnum op;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody withOp(PutFilesIdMetadataGlobalBoxSkillsCardsRequestBodyOpEnum op) {
        this.op = op;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    public String path;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Object value;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody withValue(Object value) {
        this.value = value;
        return this;
    }
}