package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TimelineSkillCardSkill
 * The service that applied this metadata.
**/
public class TimelineSkillCardSkill {
    @JsonProperty("id")
    public String id;
    public TimelineSkillCardSkill withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public TimelineSkillCardSkillTypeEnum type;
    public TimelineSkillCardSkill withType(TimelineSkillCardSkillTypeEnum type) {
        this.type = type;
        return this;
    }
}