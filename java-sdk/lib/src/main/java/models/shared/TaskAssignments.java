package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TaskAssignments
 * A list of task assignments
**/
public class TaskAssignments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public TaskAssignment[] entries;
    public TaskAssignments withEntries(TaskAssignment[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public TaskAssignments withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}