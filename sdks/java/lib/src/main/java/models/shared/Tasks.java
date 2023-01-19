package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Tasks
 * A list of tasks
**/
public class Tasks {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Task[] entries;
    public Tasks withEntries(Task[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Tasks withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}