package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadPartsOrder
 * The order in which a pagination is ordered
**/
public class UploadPartsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public UploadPartsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public UploadPartsOrderDirectionEnum direction;
    public UploadPartsOrder withDirection(UploadPartsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}