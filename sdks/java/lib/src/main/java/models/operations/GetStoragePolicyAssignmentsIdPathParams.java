package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetStoragePolicyAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=storage_policy_assignment_id")
    public String storagePolicyAssignmentId;
    public GetStoragePolicyAssignmentsIdPathParams withStoragePolicyAssignmentId(String storagePolicyAssignmentId) {
        this.storagePolicyAssignmentId = storagePolicyAssignmentId;
        return this;
    }
}