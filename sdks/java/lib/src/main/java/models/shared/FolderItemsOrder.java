package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FolderItemsOrder
 * The order in which a pagination is ordered
**/
public class FolderItemsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public FolderItemsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public FolderItemsOrderDirectionEnum direction;
    public FolderItemsOrder withDirection(FolderItemsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}