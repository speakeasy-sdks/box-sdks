package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_id")
    public String groupId;
    public GetGroupsIdPathParams withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}