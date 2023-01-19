package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebhooksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_id")
    public String webhookId;
    public PutWebhooksIdPathParams withWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
}