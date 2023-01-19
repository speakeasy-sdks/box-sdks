package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFoldersIdCopyRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PostFoldersIdCopyRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent")
    public PostFoldersIdCopyRequestBodyParent parent;
    public PostFoldersIdCopyRequestBody withParent(PostFoldersIdCopyRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
}