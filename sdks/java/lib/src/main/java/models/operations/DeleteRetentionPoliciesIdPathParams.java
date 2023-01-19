package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteRetentionPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_id")
    public String retentionPolicyId;
    public DeleteRetentionPoliciesIdPathParams withRetentionPolicyId(String retentionPolicyId) {
        this.retentionPolicyId = retentionPolicyId;
        return this;
    }
}