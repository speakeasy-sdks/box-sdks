package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ItemsOrder
 * The order in which a pagination is ordered
**/
public class ItemsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public ItemsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public ItemsOrderDirectionEnum direction;
    public ItemsOrder withDirection(ItemsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}