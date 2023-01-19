package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RecentItems
 * The part of an API response that describes marker
 * based pagination
**/
public class RecentItems {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public RecentItem[] entries;
    public RecentItems withEntries(RecentItem[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public RecentItems withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public RecentItems withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public RecentItems withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}