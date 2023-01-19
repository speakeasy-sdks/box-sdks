package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutRetentionPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_id")
    public String retentionPolicyId;
    public PutRetentionPoliciesIdPathParams withRetentionPolicyId(String retentionPolicyId) {
        this.retentionPolicyId = retentionPolicyId;
        return this;
    }
}