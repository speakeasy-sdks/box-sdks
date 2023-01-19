package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Events
 * A list of event objects
**/
public class Events {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chunk_size")
    public Long chunkSize;
    public Events withChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Event[] entries;
    public Events withEntries(Event[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_stream_position")
    public String nextStreamPosition;
    public Events withNextStreamPosition(String nextStreamPosition) {
        this.nextStreamPosition = nextStreamPosition;
        return this;
    }
}