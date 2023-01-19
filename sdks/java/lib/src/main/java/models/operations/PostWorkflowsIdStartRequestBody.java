package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostWorkflowsIdStartRequestBody {
    @JsonProperty("files")
    public PostWorkflowsIdStartRequestBodyFiles[] files;
    public PostWorkflowsIdStartRequestBody withFiles(PostWorkflowsIdStartRequestBodyFiles[] files) {
        this.files = files;
        return this;
    }
    @JsonProperty("flow")
    public PostWorkflowsIdStartRequestBodyFlow flow;
    public PostWorkflowsIdStartRequestBody withFlow(PostWorkflowsIdStartRequestBodyFlow flow) {
        this.flow = flow;
        return this;
    }
    @JsonProperty("folder")
    public PostWorkflowsIdStartRequestBodyFolder folder;
    public PostWorkflowsIdStartRequestBody withFolder(PostWorkflowsIdStartRequestBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outcomes")
    public PostWorkflowsIdStartRequestBodyOutcomes[] outcomes;
    public PostWorkflowsIdStartRequestBody withOutcomes(PostWorkflowsIdStartRequestBodyOutcomes[] outcomes) {
        this.outcomes = outcomes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostWorkflowsIdStartRequestBodyTypeEnum type;
    public PostWorkflowsIdStartRequestBody withType(PostWorkflowsIdStartRequestBodyTypeEnum type) {
        this.type = type;
        return this;
    }
}