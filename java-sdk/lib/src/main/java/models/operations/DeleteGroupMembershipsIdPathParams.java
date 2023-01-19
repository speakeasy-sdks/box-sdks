package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteGroupMembershipsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_membership_id")
    public String groupMembershipId;
    public DeleteGroupMembershipsIdPathParams withGroupMembershipId(String groupMembershipId) {
        this.groupMembershipId = groupMembershipId;
        return this;
    }
}