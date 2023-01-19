package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Metadatas
 * A list of metadata instances that have been applied to a file or folder.
**/
public class Metadatas {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Metadata[] entries;
    public Metadatas withEntries(Metadata[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Metadatas withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
}