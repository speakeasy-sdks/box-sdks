package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * LegalHoldPolicies
 * The part of an API response that describes marker
 * based pagination
**/
public class LegalHoldPolicies {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public LegalHoldPolicy[] entries;
    public LegalHoldPolicies withEntries(LegalHoldPolicy[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public LegalHoldPolicies withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public LegalHoldPolicies withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public LegalHoldPolicies withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}