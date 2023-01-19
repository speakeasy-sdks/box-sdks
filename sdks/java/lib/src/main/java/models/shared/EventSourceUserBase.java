package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EventSourceUserBase
 * The user who owns this item.
**/
public class EventSourceUserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public EventSourceUserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("login")
    public String login;
    public EventSourceUserBase withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public EventSourceUserBase withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("type")
    public EventSourceUserBaseTypeEnum type;
    public EventSourceUserBase withType(EventSourceUserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}