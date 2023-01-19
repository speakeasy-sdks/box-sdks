package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWorkflowsIdStartRequestBodyOutcomes
 * A configurable outcome the workflow should complete. If you
 * have a `task_completion_rule`, you may input `all_assignees` or
 * `any_assignee` in the `variable_value` field. Similarly, if you
 * have a `collaborator_role`, you may input `editor`, `viewer`,
 * `previewer`, `uploader`, `previewer uploader`, `viewer uploader`
 * , `co-owner` in the `variable_value` field.
**/
public class PostWorkflowsIdStartRequestBodyOutcomes {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWorkflowsIdStartRequestBodyOutcomes withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parameter")
    public String parameter;
    public PostWorkflowsIdStartRequestBodyOutcomes withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostWorkflowsIdStartRequestBodyOutcomesTypeEnum type;
    public PostWorkflowsIdStartRequestBodyOutcomes withType(PostWorkflowsIdStartRequestBodyOutcomesTypeEnum type) {
        this.type = type;
        return this;
    }
}