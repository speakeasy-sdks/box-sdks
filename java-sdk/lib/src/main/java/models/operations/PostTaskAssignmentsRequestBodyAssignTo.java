package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostTaskAssignmentsRequestBodyAssignTo
 * The user to assign the task to.
**/
public class PostTaskAssignmentsRequestBodyAssignTo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostTaskAssignmentsRequestBodyAssignTo withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login")
    public String login;
    public PostTaskAssignmentsRequestBodyAssignTo withLogin(String login) {
        this.login = login;
        return this;
    }
}