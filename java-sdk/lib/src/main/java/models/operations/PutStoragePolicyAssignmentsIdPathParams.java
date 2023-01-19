package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutStoragePolicyAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=storage_policy_assignment_id")
    public String storagePolicyAssignmentId;
    public PutStoragePolicyAssignmentsIdPathParams withStoragePolicyAssignmentId(String storagePolicyAssignmentId) {
        this.storagePolicyAssignmentId = storagePolicyAssignmentId;
        return this;
    }
}