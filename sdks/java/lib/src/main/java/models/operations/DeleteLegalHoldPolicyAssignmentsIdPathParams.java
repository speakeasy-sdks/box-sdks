package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteLegalHoldPolicyAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_assignment_id")
    public String legalHoldPolicyAssignmentId;
    public DeleteLegalHoldPolicyAssignmentsIdPathParams withLegalHoldPolicyAssignmentId(String legalHoldPolicyAssignmentId) {
        this.legalHoldPolicyAssignmentId = legalHoldPolicyAssignmentId;
        return this;
    }
}