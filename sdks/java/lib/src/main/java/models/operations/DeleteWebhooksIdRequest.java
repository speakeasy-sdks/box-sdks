package .models.operations;



public class DeleteWebhooksIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteWebhooksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteWebhooksIdPathParams pathParams;
    public DeleteWebhooksIdRequest withPathParams(DeleteWebhooksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}