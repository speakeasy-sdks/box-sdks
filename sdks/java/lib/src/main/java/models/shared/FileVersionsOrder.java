package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileVersionsOrder
 * The order in which a pagination is ordered
**/
public class FileVersionsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public FileVersionsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public FileVersionsOrderDirectionEnum direction;
    public FileVersionsOrder withDirection(FileVersionsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}