package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupMembershipsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_membership_id")
    public String groupMembershipId;
    public GetGroupMembershipsIdPathParams withGroupMembershipId(String groupMembershipId) {
        this.groupMembershipId = groupMembershipId;
        return this;
    }
}