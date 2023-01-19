package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillCardSkill
 * The service that applied this metadata.
**/
public class SkillCardSkill {
    @JsonProperty("id")
    public String id;
    public SkillCardSkill withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public SkillCardSkillTypeEnum type;
    public SkillCardSkill withType(SkillCardSkillTypeEnum type) {
        this.type = type;
        return this;
    }
}