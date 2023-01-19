package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicyAssignments
 * The part of an API response that describes marker
 * based pagination
**/
public class StoragePolicyAssignments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public StoragePolicyAssignment[] entries;
    public StoragePolicyAssignments withEntries(StoragePolicyAssignment[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public StoragePolicyAssignments withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public StoragePolicyAssignments withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public StoragePolicyAssignments withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}