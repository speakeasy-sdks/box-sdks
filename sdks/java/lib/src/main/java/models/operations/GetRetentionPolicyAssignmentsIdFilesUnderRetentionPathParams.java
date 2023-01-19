package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=retention_policy_assignment_id")
    public String retentionPolicyAssignmentId;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams withRetentionPolicyAssignmentId(String retentionPolicyAssignmentId) {
        this.retentionPolicyAssignmentId = retentionPolicyAssignmentId;
        return this;
    }
}