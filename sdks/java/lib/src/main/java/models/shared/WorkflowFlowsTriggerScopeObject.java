package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WorkflowFlowsTriggerScopeObject
 * The object the `ref` points to
**/
public class WorkflowFlowsTriggerScopeObject {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WorkflowFlowsTriggerScopeObject withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsTriggerScopeObjectTypeEnum type;
    public WorkflowFlowsTriggerScopeObject withType(WorkflowFlowsTriggerScopeObjectTypeEnum type) {
        this.type = type;
        return this;
    }
}