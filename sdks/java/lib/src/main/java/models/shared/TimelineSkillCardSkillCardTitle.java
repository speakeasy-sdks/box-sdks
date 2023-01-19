package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TimelineSkillCardSkillCardTitle
 * The title of the card.
**/
public class TimelineSkillCardSkillCardTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;
    public TimelineSkillCardSkillCardTitle withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public TimelineSkillCardSkillCardTitle withMessage(String message) {
        this.message = message;
        return this;
    }
}