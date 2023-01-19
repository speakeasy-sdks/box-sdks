package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostTaskAssignmentsRequestBodyTask
 * The task to assign to a user.
**/
public class PostTaskAssignmentsRequestBodyTask {
    @JsonProperty("id")
    public String id;
    public PostTaskAssignmentsRequestBodyTask withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostTaskAssignmentsRequestBodyTaskTypeEnum type;
    public PostTaskAssignmentsRequestBodyTask withType(PostTaskAssignmentsRequestBodyTaskTypeEnum type) {
        this.type = type;
        return this;
    }
}