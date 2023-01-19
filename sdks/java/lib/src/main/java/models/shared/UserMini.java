package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UserMini
 * A mini representation of a user, used when
 * nested within another resource.
**/
public class UserMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public UserMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public UserMini withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public UserMini withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public UserMiniTypeEnum type;
    public UserMini withType(UserMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}