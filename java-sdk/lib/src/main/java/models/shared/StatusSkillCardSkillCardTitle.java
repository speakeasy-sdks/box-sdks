package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StatusSkillCardSkillCardTitle
 * The title of the card.
**/
public class StatusSkillCardSkillCardTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;
    public StatusSkillCardSkillCardTitle withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public StatusSkillCardSkillCardTitle withMessage(String message) {
        this.message = message;
        return this;
    }
}