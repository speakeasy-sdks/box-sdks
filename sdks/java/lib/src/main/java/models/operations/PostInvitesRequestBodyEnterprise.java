package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostInvitesRequestBodyEnterprise
 * The enterprise to invite the user to
**/
public class PostInvitesRequestBodyEnterprise {
    @JsonProperty("id")
    public String id;
    public PostInvitesRequestBodyEnterprise withId(String id) {
        this.id = id;
        return this;
    }
}