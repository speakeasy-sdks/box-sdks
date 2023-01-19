package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPolicyAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_assignment_id")
    public String legalHoldPolicyAssignmentId;
    public GetLegalHoldPolicyAssignmentsIdPathParams withLegalHoldPolicyAssignmentId(String legalHoldPolicyAssignmentId) {
        this.legalHoldPolicyAssignmentId = legalHoldPolicyAssignmentId;
        return this;
    }
}