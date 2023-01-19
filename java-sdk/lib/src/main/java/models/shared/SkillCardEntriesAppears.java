package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SkillCardEntriesAppears
 * The timestamp for an entry.
**/
public class SkillCardEntriesAppears {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end")
    public Long end;
    public SkillCardEntriesAppears withEnd(Long end) {
        this.end = end;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start")
    public Long start;
    public SkillCardEntriesAppears withStart(Long start) {
        this.start = start;
        return this;
    }
}