package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFoldersIdCopyRequestBodyParent
 * The destination folder to copy the folder to.
**/
public class PostFoldersIdCopyRequestBodyParent {
    @JsonProperty("id")
    public String id;
    public PostFoldersIdCopyRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}