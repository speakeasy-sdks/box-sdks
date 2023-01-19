package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * WorkflowFlows
 * A step in a Box Relay Workflow. Each flow contains a `Trigger` and
 * a collection of Outcomes to perform once the conditions of a
 * `Trigger` are met
**/
public class WorkflowFlows {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public WorkflowFlows withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserBase createdBy;
    public WorkflowFlows withCreatedBy(UserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WorkflowFlows withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outcomes")
    public WorkflowFlowsOutcomes[] outcomes;
    public WorkflowFlows withOutcomes(WorkflowFlowsOutcomes[] outcomes) {
        this.outcomes = outcomes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trigger")
    public WorkflowFlowsTrigger trigger;
    public WorkflowFlows withTrigger(WorkflowFlowsTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WorkflowFlowsTypeEnum type;
    public WorkflowFlows withType(WorkflowFlowsTypeEnum type) {
        this.type = type;
        return this;
    }
}