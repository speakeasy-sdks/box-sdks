package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteWebhooksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_id")
    public String webhookId;
    public DeleteWebhooksIdPathParams withWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
}