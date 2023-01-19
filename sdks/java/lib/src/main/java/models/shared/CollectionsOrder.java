package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollectionsOrder
 * The order in which a pagination is ordered
**/
public class CollectionsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public CollectionsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public CollectionsOrderDirectionEnum direction;
    public CollectionsOrder withDirection(CollectionsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}