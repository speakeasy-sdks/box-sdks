package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebLinksIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutWebLinksIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutWebLinksIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public PutWebLinksIdRequestBodyParent parent;
    public PutWebLinksIdRequestBody withParent(PutWebLinksIdRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutWebLinksIdRequestBodySharedLink sharedLink;
    public PutWebLinksIdRequestBody withSharedLink(PutWebLinksIdRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;
    public PutWebLinksIdRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
}