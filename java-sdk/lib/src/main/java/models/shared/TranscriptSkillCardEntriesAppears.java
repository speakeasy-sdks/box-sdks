package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TranscriptSkillCardEntriesAppears
 * The timestamp for an entry.
**/
public class TranscriptSkillCardEntriesAppears {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start")
    public Long start;
    public TranscriptSkillCardEntriesAppears withStart(Long start) {
        this.start = start;
        return this;
    }
}