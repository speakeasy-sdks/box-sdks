package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TranscriptSkillCardEntries
 * An entry in the `entries` attribute of a metadata card
**/
public class TranscriptSkillCardEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("appears")
    public TranscriptSkillCardEntriesAppears[] appears;
    public TranscriptSkillCardEntries withAppears(TranscriptSkillCardEntriesAppears[] appears) {
        this.appears = appears;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public TranscriptSkillCardEntries withText(String text) {
        this.text = text;
        return this;
    }
}