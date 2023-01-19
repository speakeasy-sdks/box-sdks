package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicies
 * The part of an API response that describes marker
 * based pagination
**/
public class StoragePolicies {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public StoragePolicy[] entries;
    public StoragePolicies withEntries(StoragePolicy[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public StoragePolicies withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public StoragePolicies withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public StoragePolicies withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}