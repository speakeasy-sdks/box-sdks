package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationUserBase
 * The user who created the collaboration object
**/
public class CollaborationUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CollaborationUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public CollaborationUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public CollaborationUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public CollaborationUserBaseTypeEnum type;
    public CollaborationUserBase withType(CollaborationUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}