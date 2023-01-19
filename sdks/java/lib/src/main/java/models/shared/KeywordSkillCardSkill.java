package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KeywordSkillCardSkill
 * The service that applied this metadata.
**/
public class KeywordSkillCardSkill {
    @JsonProperty("id")
    public String id;
    public KeywordSkillCardSkill withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public KeywordSkillCardSkillTypeEnum type;
    public KeywordSkillCardSkill withType(KeywordSkillCardSkillTypeEnum type) {
        this.type = type;
        return this;
    }
}