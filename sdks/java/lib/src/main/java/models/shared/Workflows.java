package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Workflows
 * The part of an API response that describes marker
 * based pagination
**/
public class Workflows {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Workflow[] entries;
    public Workflows withEntries(Workflow[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Workflows withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public Workflows withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public Workflows withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}