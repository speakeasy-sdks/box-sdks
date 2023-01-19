package .models.operations;



public class PutWebhooksIdResponse {
    public .models.shared.ClientError clientError;
    public PutWebhooksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutWebhooksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutWebhooksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Webhook webhook;
    public PutWebhooksIdResponse withWebhook(.models.shared.Webhook webhook) {
        this.webhook = webhook;
        return this;
    }
}