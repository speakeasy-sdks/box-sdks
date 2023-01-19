package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteUsersIdAvatarPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public DeleteUsersIdAvatarPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}