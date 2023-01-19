package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UsersOrder
 * The order in which a pagination is ordered
**/
public class UsersOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public UsersOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public UsersOrderDirectionEnum direction;
    public UsersOrder withDirection(UsersOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}