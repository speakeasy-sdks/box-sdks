package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * KeywordSkillCardEntries
 * An entry in the `entries` attribute of a metadata card
**/
public class KeywordSkillCardEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public KeywordSkillCardEntries withText(String text) {
        this.text = text;
        return this;
    }
}