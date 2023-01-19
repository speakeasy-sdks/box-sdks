package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutSkillInvocationsIdRequestBodyMetadata
 * The metadata to set for this skill. This is a list of
 * Box Skills cards. These cards will overwrite any existing Box
 * skill cards on the file.
**/
public class PutSkillInvocationsIdRequestBodyMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cards")
    public Object[] cards;
    public PutSkillInvocationsIdRequestBodyMetadata withCards(Object[] cards) {
        this.cards = cards;
        return this;
    }
}