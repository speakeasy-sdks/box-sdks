package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFoldersRequestBodyParent
 * The parent folder to create the new folder within.
**/
public class PostFoldersRequestBodyParent {
    @JsonProperty("id")
    public String id;
    public PostFoldersRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}