package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FolderLocks
 * The part of an API response that describes marker
 * based pagination
**/
public class FolderLocks {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public FolderLock[] entries;
    public FolderLocks withEntries(FolderLock[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public FolderLocks withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public FolderLocks withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public FolderLocks withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}