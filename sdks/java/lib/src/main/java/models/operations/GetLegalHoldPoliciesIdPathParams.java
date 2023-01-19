package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_id")
    public String legalHoldPolicyId;
    public GetLegalHoldPoliciesIdPathParams withLegalHoldPolicyId(String legalHoldPolicyId) {
        this.legalHoldPolicyId = legalHoldPolicyId;
        return this;
    }
}