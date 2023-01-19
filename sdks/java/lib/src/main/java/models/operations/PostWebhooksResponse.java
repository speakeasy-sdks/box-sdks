package .models.operations;



public class PostWebhooksResponse {
    public .models.shared.ClientError clientError;
    public PostWebhooksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostWebhooksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostWebhooksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Webhook webhook;
    public PostWebhooksResponse withWebhook(.models.shared.Webhook webhook) {
        this.webhook = webhook;
        return this;
    }
}