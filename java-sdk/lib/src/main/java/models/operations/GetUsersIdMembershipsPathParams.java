package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdMembershipsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public GetUsersIdMembershipsPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}