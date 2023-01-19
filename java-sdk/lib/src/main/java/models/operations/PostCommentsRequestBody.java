package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostCommentsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    public PostCommentsRequestBodyItem item;
    public PostCommentsRequestBody withItem(PostCommentsRequestBodyItem item) {
        this.item = item;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public PostCommentsRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagged_message")
    public String taggedMessage;
    public PostCommentsRequestBody withTaggedMessage(String taggedMessage) {
        this.taggedMessage = taggedMessage;
        return this;
    }
}