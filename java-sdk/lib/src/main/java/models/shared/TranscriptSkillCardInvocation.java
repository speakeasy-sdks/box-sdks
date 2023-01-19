package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TranscriptSkillCardInvocation
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
public class TranscriptSkillCardInvocation {
    @JsonProperty("id")
    public String id;
    public TranscriptSkillCardInvocation withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public TranscriptSkillCardInvocationTypeEnum type;
    public TranscriptSkillCardInvocation withType(TranscriptSkillCardInvocationTypeEnum type) {
        this.type = type;
        return this;
    }
}