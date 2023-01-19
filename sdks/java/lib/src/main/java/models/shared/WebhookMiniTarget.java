package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WebhookMiniTarget
 * The item that will trigger the webhook
**/
public class WebhookMiniTarget {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WebhookMiniTarget withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WebhookMiniTargetTypeEnum type;
    public WebhookMiniTarget withType(WebhookMiniTargetTypeEnum type) {
        this.type = type;
        return this;
    }
}