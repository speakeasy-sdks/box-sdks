package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TrackingCode
 * Tracking codes allow an admin to generate reports from the admin console
 * and assign an attribute to a specific group of users.
 * This setting must be enabled for an enterprise before it can be used.
**/
public class TrackingCode {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TrackingCode withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TrackingCodeTypeEnum type;
    public TrackingCode withType(TrackingCodeTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public TrackingCode withValue(String value) {
        this.value = value;
        return this;
    }
}