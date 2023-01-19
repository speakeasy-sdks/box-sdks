package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostCollaborationsRequestBodyItem
 * The item to attach the comment to.
**/
public class PostCollaborationsRequestBodyItem {
    @JsonProperty("id")
    public String id;
    public PostCollaborationsRequestBodyItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostCollaborationsRequestBodyItemTypeEnum type;
    public PostCollaborationsRequestBodyItem withType(PostCollaborationsRequestBodyItemTypeEnum type) {
        this.type = type;
        return this;
    }
}