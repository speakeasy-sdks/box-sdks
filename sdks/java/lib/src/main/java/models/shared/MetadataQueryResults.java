package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQueryResults
 * A page of files and folders that matched the metadata query.
**/
public class MetadataQueryResults {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Object[] entries;
    public MetadataQueryResults withEntries(Object[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public MetadataQueryResults withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public MetadataQueryResults withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}