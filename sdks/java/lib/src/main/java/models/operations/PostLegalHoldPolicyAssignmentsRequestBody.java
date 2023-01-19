package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostLegalHoldPolicyAssignmentsRequestBody {
    @JsonProperty("assign_to")
    public PostLegalHoldPolicyAssignmentsRequestBodyAssignTo assignTo;
    public PostLegalHoldPolicyAssignmentsRequestBody withAssignTo(PostLegalHoldPolicyAssignmentsRequestBodyAssignTo assignTo) {
        this.assignTo = assignTo;
        return this;
    }
    @JsonProperty("policy_id")
    public String policyId;
    public PostLegalHoldPolicyAssignmentsRequestBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
}