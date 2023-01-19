package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostWebLinksIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PostWebLinksIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public PostWebLinksIdRequestBodyParent parent;
    public PostWebLinksIdRequestBody withParent(PostWebLinksIdRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
}