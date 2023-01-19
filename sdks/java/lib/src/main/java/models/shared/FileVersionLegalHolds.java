package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileVersionLegalHolds
 * The part of an API response that describes marker
 * based pagination
**/
public class FileVersionLegalHolds {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public FileVersionLegalHold[] entries;
    public FileVersionLegalHolds withEntries(FileVersionLegalHold[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public FileVersionLegalHolds withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public FileVersionLegalHolds withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public FileVersionLegalHolds withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}