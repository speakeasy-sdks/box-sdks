package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutWebLinksIdRequestBodyParent
 * The parent for this item
**/
public class PutWebLinksIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutWebLinksIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}