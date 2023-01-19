package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StatusSkillCardStatus
 * Sets the status of the skill. This can be used to show a message to the user while the Skill is processing the data, or if it was not able to process the file.
**/
public class StatusSkillCardStatus {
    @JsonProperty("code")
    public StatusSkillCardStatusCodeEnum code;
    public StatusSkillCardStatus withCode(StatusSkillCardStatusCodeEnum code) {
        this.code = code;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public StatusSkillCardStatus withMessage(String message) {
        this.message = message;
        return this;
    }
}