package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * GroupsOrder
 * The order in which a pagination is ordered
**/
public class GroupsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public GroupsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public GroupsOrderDirectionEnum direction;
    public GroupsOrder withDirection(GroupsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}