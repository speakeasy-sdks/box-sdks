package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutSkillInvocationsIdRequestBodyFileVersion
 * The optional file version to assign the cards to.
**/
public class PutSkillInvocationsIdRequestBodyFileVersion {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutSkillInvocationsIdRequestBodyFileVersion withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PutSkillInvocationsIdRequestBodyFileVersionTypeEnum type;
    public PutSkillInvocationsIdRequestBodyFileVersion withType(PutSkillInvocationsIdRequestBodyFileVersionTypeEnum type) {
        this.type = type;
        return this;
    }
}