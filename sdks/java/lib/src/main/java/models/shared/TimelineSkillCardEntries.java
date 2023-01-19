package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TimelineSkillCardEntries
 * An single item that's placed on multiple items on the timeline.
**/
public class TimelineSkillCardEntries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("appears")
    public TimelineSkillCardEntriesAppears[] appears;
    public TimelineSkillCardEntries withAppears(TimelineSkillCardEntriesAppears[] appears) {
        this.appears = appears;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;
    public TimelineSkillCardEntries withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public TimelineSkillCardEntries withText(String text) {
        this.text = text;
        return this;
    }
}