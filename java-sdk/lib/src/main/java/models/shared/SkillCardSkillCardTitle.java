package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SkillCardSkillCardTitle
 * The title of the card.
**/
public class SkillCardSkillCardTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;
    public SkillCardSkillCardTitle withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public SkillCardSkillCardTitle withMessage(String message) {
        this.message = message;
        return this;
    }
}