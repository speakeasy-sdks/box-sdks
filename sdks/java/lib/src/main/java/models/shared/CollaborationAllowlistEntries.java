package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationAllowlistEntries
 * The part of an API response that describes marker
 * based pagination
**/
public class CollaborationAllowlistEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public CollaborationAllowlistEntry[] entries;
    public CollaborationAllowlistEntries withEntries(CollaborationAllowlistEntry[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public CollaborationAllowlistEntries withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public CollaborationAllowlistEntries withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public CollaborationAllowlistEntries withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}