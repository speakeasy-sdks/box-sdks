package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPoliciesIdAssignmentsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_id")
    public String retentionPolicyId;
    public GetRetentionPoliciesIdAssignmentsPathParams withRetentionPolicyId(String retentionPolicyId) {
        this.retentionPolicyId = retentionPolicyId;
        return this;
    }
}