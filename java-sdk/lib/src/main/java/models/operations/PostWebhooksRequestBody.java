package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostWebhooksRequestBody {
    @JsonProperty("address")
    public String address;
    public PostWebhooksRequestBody withAddress(String address) {
        this.address = address;
        return this;
    }
    @JsonProperty("target")
    public PostWebhooksRequestBodyTarget target;
    public PostWebhooksRequestBody withTarget(PostWebhooksRequestBodyTarget target) {
        this.target = target;
        return this;
    }
    @JsonProperty("triggers")
    public PostWebhooksRequestBodyWebhookTriggerEnum[] triggers;
    public PostWebhooksRequestBody withTriggers(PostWebhooksRequestBodyWebhookTriggerEnum[] triggers) {
        this.triggers = triggers;
        return this;
    }
}