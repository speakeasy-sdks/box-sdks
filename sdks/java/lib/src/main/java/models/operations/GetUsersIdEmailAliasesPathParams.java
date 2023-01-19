package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdEmailAliasesPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public GetUsersIdEmailAliasesPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}