package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillCardInvocation
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
public class SkillCardInvocation {
    @JsonProperty("id")
    public String id;
    public SkillCardInvocation withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public SkillCardInvocationTypeEnum type;
    public SkillCardInvocation withType(SkillCardInvocationTypeEnum type) {
        this.type = type;
        return this;
    }
}