package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TranscriptSkillCardSkill
 * The service that applied this metadata.
**/
public class TranscriptSkillCardSkill {
    @JsonProperty("id")
    public String id;
    public TranscriptSkillCardSkill withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public TranscriptSkillCardSkillTypeEnum type;
    public TranscriptSkillCardSkill withType(TranscriptSkillCardSkillTypeEnum type) {
        this.type = type;
        return this;
    }
}