package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostRetentionPolicyAssignmentsRequestBody {
    @JsonProperty("assign_to")
    public PostRetentionPolicyAssignmentsRequestBodyAssignTo assignTo;
    public PostRetentionPolicyAssignmentsRequestBody withAssignTo(PostRetentionPolicyAssignmentsRequestBodyAssignTo assignTo) {
        this.assignTo = assignTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter_fields")
    public PostRetentionPolicyAssignmentsRequestBodyFilterFields[] filterFields;
    public PostRetentionPolicyAssignmentsRequestBody withFilterFields(PostRetentionPolicyAssignmentsRequestBodyFilterFields[] filterFields) {
        this.filterFields = filterFields;
        return this;
    }
    @JsonProperty("policy_id")
    public String policyId;
    public PostRetentionPolicyAssignmentsRequestBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date_field")
    public String startDateField;
    public PostRetentionPolicyAssignmentsRequestBody withStartDateField(String startDateField) {
        this.startDateField = startDateField;
        return this;
    }
}