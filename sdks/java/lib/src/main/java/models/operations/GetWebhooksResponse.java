package .models.operations;



public class GetWebhooksResponse {
    public .models.shared.ClientError clientError;
    public GetWebhooksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetWebhooksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetWebhooksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Webhooks webhooks;
    public GetWebhooksResponse withWebhooks(.models.shared.Webhooks webhooks) {
        this.webhooks = webhooks;
        return this;
    }
}