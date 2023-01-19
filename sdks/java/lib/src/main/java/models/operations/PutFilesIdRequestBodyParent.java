package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFilesIdRequestBodyParent
 * The parent for this item
**/
public class PutFilesIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutFilesIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}