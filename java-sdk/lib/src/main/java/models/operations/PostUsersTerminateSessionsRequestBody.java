package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUsersTerminateSessionsRequestBody {
    @JsonProperty("user_ids")
    public String[] userIds;
    public PostUsersTerminateSessionsRequestBody withUserIds(String[] userIds) {
        this.userIds = userIds;
        return this;
    }
    @JsonProperty("user_logins")
    public String[] userLogins;
    public PostUsersTerminateSessionsRequestBody withUserLogins(String[] userLogins) {
        this.userLogins = userLogins;
        return this;
    }
}