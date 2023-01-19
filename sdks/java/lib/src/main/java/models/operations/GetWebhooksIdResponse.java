package .models.operations;



public class GetWebhooksIdResponse {
    public .models.shared.ClientError clientError;
    public GetWebhooksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetWebhooksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetWebhooksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Webhook webhook;
    public GetWebhooksIdResponse withWebhook(.models.shared.Webhook webhook) {
        this.webhook = webhook;
        return this;
    }
}