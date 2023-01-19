package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * KeywordSkillCardSkillCardTitle
 * The title of the card.
**/
public class KeywordSkillCardSkillCardTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;
    public KeywordSkillCardSkillCardTitle withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public KeywordSkillCardSkillCardTitle withMessage(String message) {
        this.message = message;
        return this;
    }
}