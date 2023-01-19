package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQueryIndexFields
 * The field which makes up the index.
**/
public class MetadataQueryIndexFields {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public MetadataQueryIndexFields withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort_direction")
    public MetadataQueryIndexFieldsSortDirectionEnum sortDirection;
    public MetadataQueryIndexFields withSortDirection(MetadataQueryIndexFieldsSortDirectionEnum sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
}