package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WorkflowFlowsOutcomes
 * List of outcomes to perform once the conditions of trigger are met.
**/
public class WorkflowFlowsOutcomes {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_type")
    public WorkflowFlowsOutcomesActionTypeEnum actionType;
    public WorkflowFlowsOutcomes withActionType(WorkflowFlowsOutcomesActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WorkflowFlowsOutcomes withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("if_rejected")
    public WorkflowFlowsOutcomesIfRejected[] ifRejected;
    public WorkflowFlowsOutcomes withIfRejected(WorkflowFlowsOutcomesIfRejected[] ifRejected) {
        this.ifRejected = ifRejected;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public WorkflowFlowsOutcomes withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsOutcomesTypeEnum type;
    public WorkflowFlowsOutcomes withType(WorkflowFlowsOutcomesTypeEnum type) {
        this.type = type;
        return this;
    }
}