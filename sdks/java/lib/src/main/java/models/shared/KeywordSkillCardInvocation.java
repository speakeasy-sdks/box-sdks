package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KeywordSkillCardInvocation
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
public class KeywordSkillCardInvocation {
    @JsonProperty("id")
    public String id;
    public KeywordSkillCardInvocation withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public KeywordSkillCardInvocationTypeEnum type;
    public KeywordSkillCardInvocation withType(KeywordSkillCardInvocationTypeEnum type) {
        this.type = type;
        return this;
    }
}