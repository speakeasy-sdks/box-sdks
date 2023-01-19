package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWorkflowsIdStartRequestBodyFlow
 * The flow that will be triggered
**/
public class PostWorkflowsIdStartRequestBodyFlow {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWorkflowsIdStartRequestBodyFlow withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public PostWorkflowsIdStartRequestBodyFlow withType(String type) {
        this.type = type;
        return this;
    }
}