package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutLegalHoldPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_id")
    public String legalHoldPolicyId;
    public PutLegalHoldPoliciesIdPathParams withLegalHoldPolicyId(String legalHoldPolicyId) {
        this.legalHoldPolicyId = legalHoldPolicyId;
        return this;
    }
}