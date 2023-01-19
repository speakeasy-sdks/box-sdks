package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TranscriptSkillCardSkillCardTitle
 * The title of the card.
**/
public class TranscriptSkillCardSkillCardTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;
    public TranscriptSkillCardSkillCardTitle withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public TranscriptSkillCardSkillCardTitle withMessage(String message) {
        this.message = message;
        return this;
    }
}