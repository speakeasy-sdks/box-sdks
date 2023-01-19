package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutSkillInvocationsIdRequestBodyFile
 * The file to assign the cards to.
**/
public class PutSkillInvocationsIdRequestBodyFile {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutSkillInvocationsIdRequestBodyFile withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PutSkillInvocationsIdRequestBodyFileTypeEnum type;
    public PutSkillInvocationsIdRequestBodyFile withType(PutSkillInvocationsIdRequestBodyFileTypeEnum type) {
        this.type = type;
        return this;
    }
}