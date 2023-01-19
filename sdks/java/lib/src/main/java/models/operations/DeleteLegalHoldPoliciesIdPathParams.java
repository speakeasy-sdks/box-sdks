package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteLegalHoldPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_id")
    public String legalHoldPolicyId;
    public DeleteLegalHoldPoliciesIdPathParams withLegalHoldPolicyId(String legalHoldPolicyId) {
        this.legalHoldPolicyId = legalHoldPolicyId;
        return this;
    }
}