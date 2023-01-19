package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostCollaborationsRequestBodyAccessibleBy
 * The user or group to give access to the item.
**/
public class PostCollaborationsRequestBodyAccessibleBy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostCollaborationsRequestBodyAccessibleBy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login")
    public String login;
    public PostCollaborationsRequestBodyAccessibleBy withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("type")
    public PostCollaborationsRequestBodyAccessibleByTypeEnum type;
    public PostCollaborationsRequestBodyAccessibleBy withType(PostCollaborationsRequestBodyAccessibleByTypeEnum type) {
        this.type = type;
        return this;
    }
}