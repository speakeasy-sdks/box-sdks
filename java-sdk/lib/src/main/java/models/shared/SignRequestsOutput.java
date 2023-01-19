package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SignRequestsOutput
 * The part of an API response that describes marker
 * based pagination
**/
public class SignRequestsOutput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public SignRequestOutput[] entries;
    public SignRequestsOutput withEntries(SignRequestOutput[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public SignRequestsOutput withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public SignRequestsOutput withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public SignRequestsOutput withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}