package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdAvatarPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public GetUsersIdAvatarPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}