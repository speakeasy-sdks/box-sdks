package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFilesIdCopyRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PostFilesIdCopyRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent")
    public PostFilesIdCopyRequestBodyParent parent;
    public PostFilesIdCopyRequestBody withParent(PostFilesIdCopyRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;
    public PostFilesIdCopyRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }
}