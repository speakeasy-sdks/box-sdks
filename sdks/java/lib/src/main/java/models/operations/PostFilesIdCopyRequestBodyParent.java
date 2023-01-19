package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFilesIdCopyRequestBodyParent
 * The destination folder to copy the file to.
**/
public class PostFilesIdCopyRequestBodyParent {
    @JsonProperty("id")
    public String id;
    public PostFilesIdCopyRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}