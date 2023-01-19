package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WebhookMini
 * Represents a configured webhook.
**/
public class WebhookMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public WebhookMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    public WebhookMiniTarget target;
    public WebhookMini withTarget(WebhookMiniTarget target) {
        this.target = target;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public WebhookMiniTypeEnum type;
    public WebhookMini withType(WebhookMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}