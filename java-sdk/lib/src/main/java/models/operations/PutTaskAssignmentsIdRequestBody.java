package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutTaskAssignmentsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public PutTaskAssignmentsIdRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resolution_state")
    public PutTaskAssignmentsIdRequestBodyResolutionStateEnum resolutionState;
    public PutTaskAssignmentsIdRequestBody withResolutionState(PutTaskAssignmentsIdRequestBodyResolutionStateEnum resolutionState) {
        this.resolutionState = resolutionState;
        return this;
    }
}