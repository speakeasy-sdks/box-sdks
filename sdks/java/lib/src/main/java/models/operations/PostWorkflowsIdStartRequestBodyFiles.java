package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWorkflowsIdStartRequestBodyFiles
 * A file the workflow should start for
**/
public class PostWorkflowsIdStartRequestBodyFiles {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWorkflowsIdStartRequestBodyFiles withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostWorkflowsIdStartRequestBodyFilesTypeEnum type;
    public PostWorkflowsIdStartRequestBodyFiles withType(PostWorkflowsIdStartRequestBodyFilesTypeEnum type) {
        this.type = type;
        return this;
    }
}