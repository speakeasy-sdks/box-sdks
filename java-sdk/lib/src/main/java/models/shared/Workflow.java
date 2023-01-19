package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Workflow
 * Box Relay Workflows are objects that represent a named collection of flows.
 * 
 * You application must be authorized to use the `Manage Box Relay` application
 * scope within the developer console in order to use this resource.
**/
public class Workflow {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public Workflow withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flows")
    public WorkflowFlows[] flows;
    public Workflow withFlows(WorkflowFlows[] flows) {
        this.flows = flows;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public Workflow withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_enabled")
    public Boolean isEnabled;
    public Workflow withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public Workflow withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowTypeEnum type;
    public Workflow withType(WorkflowTypeEnum type) {
        this.type = type;
        return this;
    }
}