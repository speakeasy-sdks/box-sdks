package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFileUserBase
 * The user who last modified this file
**/
public class TrashFileUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFileUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public TrashFileUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TrashFileUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public TrashFileUserBaseTypeEnum type;
    public TrashFileUserBase withType(TrashFileUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}