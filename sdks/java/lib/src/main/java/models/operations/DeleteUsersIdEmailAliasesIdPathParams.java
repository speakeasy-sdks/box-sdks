package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteUsersIdEmailAliasesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=email_alias_id")
    public String emailAliasId;
    public DeleteUsersIdEmailAliasesIdPathParams withEmailAliasId(String emailAliasId) {
        this.emailAliasId = emailAliasId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;
    public DeleteUsersIdEmailAliasesIdPathParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}