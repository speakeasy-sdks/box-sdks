package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdFolders0PathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public PutUsersIdFolders0PathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}