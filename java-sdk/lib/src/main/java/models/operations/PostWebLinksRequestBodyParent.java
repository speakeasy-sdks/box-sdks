package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostWebLinksRequestBodyParent
 * The parent folder to create the web link within.
**/
public class PostWebLinksRequestBodyParent {
    @JsonProperty("id")
    public String id;
    public PostWebLinksRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}