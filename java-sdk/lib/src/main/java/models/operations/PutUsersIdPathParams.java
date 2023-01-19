package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public PutUsersIdPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}