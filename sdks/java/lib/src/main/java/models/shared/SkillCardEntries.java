package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SkillCardEntries
 * An entry in the `entries` attribute of a metadata card
**/
public class SkillCardEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("appears")
    public SkillCardEntriesAppears[] appears;
    public SkillCardEntries withAppears(SkillCardEntriesAppears[] appears) {
        this.appears = appears;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;
    public SkillCardEntries withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public SkillCardEntries withText(String text) {
        this.text = text;
        return this;
    }
}