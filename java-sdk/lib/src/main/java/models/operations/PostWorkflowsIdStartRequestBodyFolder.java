package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWorkflowsIdStartRequestBodyFolder
 * The folder object for which the workflow is configured.
**/
public class PostWorkflowsIdStartRequestBodyFolder {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWorkflowsIdStartRequestBodyFolder withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostWorkflowsIdStartRequestBodyFolderTypeEnum type;
    public PostWorkflowsIdStartRequestBodyFolder withType(PostWorkflowsIdStartRequestBodyFolderTypeEnum type) {
        this.type = type;
        return this;
    }
}