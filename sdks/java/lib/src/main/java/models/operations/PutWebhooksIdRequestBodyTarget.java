package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutWebhooksIdRequestBodyTarget
 * The item that will trigger the webhook
**/
public class PutWebhooksIdRequestBodyTarget {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutWebhooksIdRequestBodyTarget withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PutWebhooksIdRequestBodyTargetTypeEnum type;
    public PutWebhooksIdRequestBodyTarget withType(PutWebhooksIdRequestBodyTargetTypeEnum type) {
        this.type = type;
        return this;
    }
}