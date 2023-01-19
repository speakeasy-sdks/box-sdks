package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FilesUnderRetention
 * The part of an API response that describes marker
 * based pagination
**/
public class FilesUnderRetention {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public FileMini[] entries;
    public FilesUnderRetention withEntries(FileMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public FilesUnderRetention withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public FilesUnderRetention withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public FilesUnderRetention withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}