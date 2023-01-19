package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFolderLocksRequestBodyFolder
 * The folder to apply the lock to.
**/
public class PostFolderLocksRequestBodyFolder {
    @JsonProperty("id")
    public String id;
    public PostFolderLocksRequestBodyFolder withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public String type;
    public PostFolderLocksRequestBodyFolder withType(String type) {
        this.type = type;
        return this;
    }
}