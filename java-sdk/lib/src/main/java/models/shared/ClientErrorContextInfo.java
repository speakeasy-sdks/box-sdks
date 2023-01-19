package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClientErrorContextInfo
 * A free-form object that contains additional context
 * about the error. The possible fields are defined on
 * a per-endpoint basis. `message` is only one example.
**/
public class ClientErrorContextInfo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public ClientErrorContextInfo withMessage(String message) {
        this.message = message;
        return this;
    }
}