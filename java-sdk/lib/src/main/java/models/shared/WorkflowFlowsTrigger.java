package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class WorkflowFlowsTrigger {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public WorkflowFlowsTriggerScope[] scope;
    public WorkflowFlowsTrigger withScope(WorkflowFlowsTriggerScope[] scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trigger_type")
    public WorkflowFlowsTriggerTriggerTypeEnum triggerType;
    public WorkflowFlowsTrigger withTriggerType(WorkflowFlowsTriggerTriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsTriggerTypeEnum type;
    public WorkflowFlowsTrigger withType(WorkflowFlowsTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}