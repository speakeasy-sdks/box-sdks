package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebhooksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_id")
    public String webhookId;
    public GetWebhooksIdPathParams withWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
}