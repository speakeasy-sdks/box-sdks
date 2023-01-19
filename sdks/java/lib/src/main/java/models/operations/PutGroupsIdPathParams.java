package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutGroupsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=group_id")
    public String groupId;
    public PutGroupsIdPathParams withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}