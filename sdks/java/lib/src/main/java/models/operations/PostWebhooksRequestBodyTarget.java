package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostWebhooksRequestBodyTarget
 * The item that will trigger the webhook
**/
public class PostWebhooksRequestBodyTarget {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostWebhooksRequestBodyTarget withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostWebhooksRequestBodyTargetTypeEnum type;
    public PostWebhooksRequestBodyTarget withType(PostWebhooksRequestBodyTargetTypeEnum type) {
        this.type = type;
        return this;
    }
}