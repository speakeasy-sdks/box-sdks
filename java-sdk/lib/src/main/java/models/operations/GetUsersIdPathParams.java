package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public GetUsersIdPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}