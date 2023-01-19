package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetInvitesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invite_id")
    public String inviteId;
    public GetInvitesIdPathParams withInviteId(String inviteId) {
        this.inviteId = inviteId;
        return this;
    }
}