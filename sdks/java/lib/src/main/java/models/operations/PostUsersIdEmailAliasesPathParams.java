package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdEmailAliasesPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public PostUsersIdEmailAliasesPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}