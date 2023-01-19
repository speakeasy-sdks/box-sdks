package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataTemplates
 * The part of an API response that describes marker
 * based pagination
**/
public class MetadataTemplates {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public MetadataTemplate[] entries;
    public MetadataTemplates withEntries(MetadataTemplate[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public MetadataTemplates withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public MetadataTemplates withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public MetadataTemplates withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}