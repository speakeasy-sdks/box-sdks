package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class WorkflowFlowsOutcomesIfRejected {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_type")
    public WorkflowFlowsOutcomesIfRejectedActionTypeEnum actionType;
    public WorkflowFlowsOutcomesIfRejected withActionType(WorkflowFlowsOutcomesIfRejectedActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WorkflowFlowsOutcomesIfRejected withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public WorkflowFlowsOutcomesIfRejected withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsOutcomesIfRejectedTypeEnum type;
    public WorkflowFlowsOutcomesIfRejected withType(WorkflowFlowsOutcomesIfRejectedTypeEnum type) {
        this.type = type;
        return this;
    }
}