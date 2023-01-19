package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostWebLinksRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostWebLinksRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PostWebLinksRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent")
    public PostWebLinksRequestBodyParent parent;
    public PostWebLinksRequestBody withParent(PostWebLinksRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PostWebLinksRequestBodySharedLink sharedLink;
    public PostWebLinksRequestBody withSharedLink(PostWebLinksRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonProperty("url")
    public String url;
    public PostWebLinksRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
}