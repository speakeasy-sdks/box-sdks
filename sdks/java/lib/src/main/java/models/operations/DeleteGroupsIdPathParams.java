package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteGroupsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_id")
    public String groupId;
    public DeleteGroupsIdPathParams withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}