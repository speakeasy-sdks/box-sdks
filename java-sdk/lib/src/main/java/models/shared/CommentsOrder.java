package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CommentsOrder
 * The order in which a pagination is ordered
**/
public class CommentsOrder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("by")
    public String by;
    public CommentsOrder withBy(String by) {
        this.by = by;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public CommentsOrderDirectionEnum direction;
    public CommentsOrder withDirection(CommentsOrderDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
}