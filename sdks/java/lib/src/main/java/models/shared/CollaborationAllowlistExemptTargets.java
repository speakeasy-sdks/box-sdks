package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationAllowlistExemptTargets
 * The part of an API response that describes marker
 * based pagination
**/
public class CollaborationAllowlistExemptTargets {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public CollaborationAllowlistExemptTarget[] entries;
    public CollaborationAllowlistExemptTargets withEntries(CollaborationAllowlistExemptTarget[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public CollaborationAllowlistExemptTargets withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public CollaborationAllowlistExemptTargets withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public CollaborationAllowlistExemptTargets withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}