package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_id")
    public String retentionPolicyId;
    public GetRetentionPoliciesIdPathParams withRetentionPolicyId(String retentionPolicyId) {
        this.retentionPolicyId = retentionPolicyId;
        return this;
    }
}