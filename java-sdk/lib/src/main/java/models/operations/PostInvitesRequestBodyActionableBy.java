package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostInvitesRequestBodyActionableBy
 * The user to invite
**/
public class PostInvitesRequestBodyActionableBy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login")
    public String login;
    public PostInvitesRequestBodyActionableBy withLogin(String login) {
        this.login = login;
        return this;
    }
}