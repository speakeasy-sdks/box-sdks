package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RealtimeServers
 * A list of real-time servers that can
 * be used for long-polling.
**/
public class RealtimeServers {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chunk_size")
    public Long chunkSize;
    public RealtimeServers withChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public RealtimeServer[] entries;
    public RealtimeServers withEntries(RealtimeServer[] entries) {
        this.entries = entries;
        return this;
    }
}