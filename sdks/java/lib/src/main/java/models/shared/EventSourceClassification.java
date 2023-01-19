package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EventSourceClassification
 * The object containing classification information for the item that
 * triggered the event. This field will not appear if the item does not
 * have a classification set.
**/
public class EventSourceClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public EventSourceClassification withName(String name) {
        this.name = name;
        return this;
    }
}