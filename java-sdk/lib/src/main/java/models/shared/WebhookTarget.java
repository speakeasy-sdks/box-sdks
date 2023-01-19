package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WebhookTarget
 * The item that will trigger the webhook
**/
public class WebhookTarget {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WebhookTarget withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WebhookTargetTypeEnum type;
    public WebhookTarget withType(WebhookTargetTypeEnum type) {
        this.type = type;
        return this;
    }
}