package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteUsersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public DeleteUsersIdPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}