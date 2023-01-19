package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SessionTerminationMessage
 * A message informing about the
 * termination job status
**/
public class SessionTerminationMessage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public SessionTerminationMessage withMessage(String message) {
        this.message = message;
        return this;
    }
}