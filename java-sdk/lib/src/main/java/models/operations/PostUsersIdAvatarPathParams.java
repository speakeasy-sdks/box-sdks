package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdAvatarPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public PostUsersIdAvatarPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}