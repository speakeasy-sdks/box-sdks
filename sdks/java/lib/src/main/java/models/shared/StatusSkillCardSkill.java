package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusSkillCardSkill
 * The service that applied this metadata.
**/
public class StatusSkillCardSkill {
    @JsonProperty("id")
    public String id;
    public StatusSkillCardSkill withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public StatusSkillCardSkillTypeEnum type;
    public StatusSkillCardSkill withType(StatusSkillCardSkillTypeEnum type) {
        this.type = type;
        return this;
    }
}