package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostFilesIdRequestBodyParent
 * The parent for this item
**/
public class PostFilesIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostFilesIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}