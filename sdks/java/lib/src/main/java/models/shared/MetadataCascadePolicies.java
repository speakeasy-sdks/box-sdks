package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataCascadePolicies
 * The part of an API response that describes marker
 * based pagination
**/
public class MetadataCascadePolicies {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public MetadataCascadePolicy[] entries;
    public MetadataCascadePolicies withEntries(MetadataCascadePolicy[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public MetadataCascadePolicies withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public MetadataCascadePolicies withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public MetadataCascadePolicies withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}