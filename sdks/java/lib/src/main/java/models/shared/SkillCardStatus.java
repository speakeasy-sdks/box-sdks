package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SkillCardStatus
 * Used with a card of type `status` to set the status of the skill. This can be used to show a message to the user while the Skill is processing the data.
**/
public class SkillCardStatus {
    @JsonProperty("code")
    public SkillCardStatusCodeEnum code;
    public SkillCardStatus withCode(SkillCardStatusCodeEnum code) {
        this.code = code;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public SkillCardStatus withMessage(String message) {
        this.message = message;
        return this;
    }
}