package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataQueryIndices
 * A collection of metadata query indices.
**/
public class MetadataQueryIndices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public MetadataQueryIndex[] entries;
    public MetadataQueryIndices withEntries(MetadataQueryIndex[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public MetadataQueryIndices withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public MetadataQueryIndices withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}