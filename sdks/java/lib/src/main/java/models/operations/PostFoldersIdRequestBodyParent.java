package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostFoldersIdRequestBodyParent
 * The parent for this item
**/
public class PostFoldersIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostFoldersIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}