package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWebLinksIdRequestBodyParent
 * The parent for this item
**/
public class PostWebLinksIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWebLinksIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}