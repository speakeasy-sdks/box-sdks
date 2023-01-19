package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * GroupMembershipsOrder
 * The order in which a pagination is ordered
**/
public class GroupMembershipsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public GroupMembershipsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public GroupMembershipsOrderDirectionEnum direction;
    public GroupMembershipsOrder withDirection(GroupMembershipsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}