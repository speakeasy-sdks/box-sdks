package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationsOrder
 * The order in which a pagination is ordered
**/
public class CollaborationsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public CollaborationsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public CollaborationsOrderDirectionEnum direction;
    public CollaborationsOrder withDirection(CollaborationsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}