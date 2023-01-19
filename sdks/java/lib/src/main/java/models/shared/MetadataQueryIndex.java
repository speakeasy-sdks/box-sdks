package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQueryIndex
 * A metadata query index
**/
public class MetadataQueryIndex {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public MetadataQueryIndexFields[] fields;
    public MetadataQueryIndex withFields(MetadataQueryIndexFields[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataQueryIndex withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("status")
    public MetadataQueryIndexStatusEnum status;
    public MetadataQueryIndex withStatus(MetadataQueryIndexStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonProperty("type")
    public String type;
    public MetadataQueryIndex withType(String type) {
        this.type = type;
        return this;
    }
}