package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=legal_hold_policy_assignment_id")
    public String legalHoldPolicyAssignmentId;
    public GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams withLegalHoldPolicyAssignmentId(String legalHoldPolicyAssignmentId) {
        this.legalHoldPolicyAssignmentId = legalHoldPolicyAssignmentId;
        return this;
    }
}