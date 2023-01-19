package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTaskAssignmentsRequestBody {
    @JsonProperty("assign_to")
    public PostTaskAssignmentsRequestBodyAssignTo assignTo;
    public PostTaskAssignmentsRequestBody withAssignTo(PostTaskAssignmentsRequestBodyAssignTo assignTo) {
        this.assignTo = assignTo;
        return this;
    }
    @JsonProperty("task")
    public PostTaskAssignmentsRequestBodyTask task;
    public PostTaskAssignmentsRequestBody withTask(PostTaskAssignmentsRequestBodyTask task) {
        this.task = task;
        return this;
    }
}