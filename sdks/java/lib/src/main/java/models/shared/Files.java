package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Files
 * A list of files
**/
public class Files {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public File[] entries;
    public Files withEntries(File[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Files withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}