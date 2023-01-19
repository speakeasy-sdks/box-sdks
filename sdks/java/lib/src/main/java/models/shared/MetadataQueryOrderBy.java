package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQueryOrderBy
 * An object representing one of the metadata template fields to sort the
 * metadata query results by.
**/
public class MetadataQueryOrderBy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public MetadataQueryOrderByDirectionEnum direction;
    public MetadataQueryOrderBy withDirection(MetadataQueryOrderByDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field_key")
    public String fieldKey;
    public MetadataQueryOrderBy withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
}