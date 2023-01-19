package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostFilesContentRequestBodyAttributesParent
 * The parent folder to upload the file to
**/
public class PostFilesContentRequestBodyAttributesParent {
    @JsonProperty("id")
    public String id;
    public PostFilesContentRequestBodyAttributesParent withId(String id) {
        this.id = id;
        return this;
    }
}