package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WorkflowFlowsTriggerScope
 * Object that describes where and how a Trigger condition is met
**/
public class WorkflowFlowsTriggerScope {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public WorkflowFlowsTriggerScopeObject object;
    public WorkflowFlowsTriggerScope withObject(WorkflowFlowsTriggerScopeObject object) {
        this.object = object;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    public String ref;
    public WorkflowFlowsTriggerScope withRef(String ref) {
        this.ref = ref;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsTriggerScopeTypeEnum type;
    public WorkflowFlowsTriggerScope withType(WorkflowFlowsTriggerScopeTypeEnum type) {
        this.type = type;
        return this;
    }
}