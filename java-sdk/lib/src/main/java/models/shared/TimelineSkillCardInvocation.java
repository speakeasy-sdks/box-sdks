package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TimelineSkillCardInvocation
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
public class TimelineSkillCardInvocation {
    @JsonProperty("id")
    public String id;
    public TimelineSkillCardInvocation withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public TimelineSkillCardInvocationTypeEnum type;
    public TimelineSkillCardInvocation withType(TimelineSkillCardInvocationTypeEnum type) {
        this.type = type;
        return this;
    }
}