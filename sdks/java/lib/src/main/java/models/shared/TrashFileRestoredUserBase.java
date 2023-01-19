package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrashFileRestoredUserBase
 * The user who last modified this file
**/
public class TrashFileRestoredUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TrashFileRestoredUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public TrashFileRestoredUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TrashFileRestoredUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public TrashFileRestoredUserBaseTypeEnum type;
    public TrashFileRestoredUserBase withType(TrashFileRestoredUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}