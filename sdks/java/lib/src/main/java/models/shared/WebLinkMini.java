package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WebLinkMini
 * Web links are objects that point to URLs. These objects
 * are also known as bookmarks within the Box web application.
 * 
 * Web link objects are treated similarly to file objects,
 * they will also support most actions that apply to regular files.
**/
public class WebLinkMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public WebLinkMini withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public WebLinkMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public WebLinkMini withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public WebLinkMini withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("type")
    public WebLinkMiniTypeEnum type;
    public WebLinkMini withType(WebLinkMiniTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;
    public WebLinkMini withUrl(String url) {
        this.url = url;
        return this;
    }
}