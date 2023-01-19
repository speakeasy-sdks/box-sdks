package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdCollaborationsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_id")
    public String groupId;
    public GetGroupsIdCollaborationsPathParams withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}