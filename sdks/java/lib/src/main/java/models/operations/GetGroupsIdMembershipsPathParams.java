package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdMembershipsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_id")
    public String groupId;
    public GetGroupsIdMembershipsPathParams withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}