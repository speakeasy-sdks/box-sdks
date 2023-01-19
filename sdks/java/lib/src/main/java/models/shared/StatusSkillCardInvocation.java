package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusSkillCardInvocation
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
public class StatusSkillCardInvocation {
    @JsonProperty("id")
    public String id;
    public StatusSkillCardInvocation withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public StatusSkillCardInvocationTypeEnum type;
    public StatusSkillCardInvocation withType(StatusSkillCardInvocationTypeEnum type) {
        this.type = type;
        return this;
    }
}