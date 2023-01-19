package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostCommentsRequestBodyItem
 * The item to attach the comment to.
**/
public class PostCommentsRequestBodyItem {
    @JsonProperty("id")
    public String id;
    public PostCommentsRequestBodyItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostCommentsRequestBodyItemTypeEnum type;
    public PostCommentsRequestBodyItem withType(PostCommentsRequestBodyItemTypeEnum type) {
        this.type = type;
        return this;
    }
}