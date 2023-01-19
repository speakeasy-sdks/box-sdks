package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_assignment_id")
    public String retentionPolicyAssignmentId;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams withRetentionPolicyAssignmentId(String retentionPolicyAssignmentId) {
        this.retentionPolicyAssignmentId = retentionPolicyAssignmentId;
        return this;
    }
}