package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TimelineSkillCardEntriesAppears
 * The timestamp for an entry.
**/
public class TimelineSkillCardEntriesAppears {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end")
    public Long end;
    public TimelineSkillCardEntriesAppears withEnd(Long end) {
        this.end = end;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start")
    public Long start;
    public TimelineSkillCardEntriesAppears withStart(Long start) {
        this.start = start;
        return this;
    }
}