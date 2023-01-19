package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteStoragePolicyAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=storage_policy_assignment_id")
    public String storagePolicyAssignmentId;
    public DeleteStoragePolicyAssignmentsIdPathParams withStoragePolicyAssignmentId(String storagePolicyAssignmentId) {
        this.storagePolicyAssignmentId = storagePolicyAssignmentId;
        return this;
    }
}