package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostTasksRequestBodyItem
 * The file to attach the task to.
**/
public class PostTasksRequestBodyItem {
    @JsonProperty("id")
    public String id;
    public PostTasksRequestBodyItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostTasksRequestBodyItemTypeEnum type;
    public PostTasksRequestBodyItem withType(PostTasksRequestBodyItemTypeEnum type) {
        this.type = type;
        return this;
    }
}