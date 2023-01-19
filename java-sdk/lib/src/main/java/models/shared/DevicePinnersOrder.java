package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DevicePinnersOrder
 * The order in which a pagination is ordered
**/
public class DevicePinnersOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public DevicePinnersOrderByEnum by;
    public DevicePinnersOrder withBy(DevicePinnersOrderByEnum by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public DevicePinnersOrderDirectionEnum direction;
    public DevicePinnersOrder withDirection(DevicePinnersOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}