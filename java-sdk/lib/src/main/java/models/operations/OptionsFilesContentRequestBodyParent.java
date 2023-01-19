package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * OptionsFilesContentRequestBodyParent
 * The parent for this item
**/
public class OptionsFilesContentRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public OptionsFilesContentRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}