package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebhooksIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public String address;
    public PutWebhooksIdRequestBody withAddress(String address) {
        this.address = address;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    public PutWebhooksIdRequestBodyTarget target;
    public PutWebhooksIdRequestBody withTarget(PutWebhooksIdRequestBodyTarget target) {
        this.target = target;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("triggers")
    public PutWebhooksIdRequestBodyWebhookTriggerEnum[] triggers;
    public PutWebhooksIdRequestBody withTriggers(PutWebhooksIdRequestBodyWebhookTriggerEnum[] triggers) {
        this.triggers = triggers;
        return this;
    }
}