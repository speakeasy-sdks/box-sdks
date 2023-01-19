package .models.operations;



public class GetWebhooksIdRequest {
    public .models.utils.RetryConfig retries;
    public GetWebhooksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWebhooksIdPathParams pathParams;
    public GetWebhooksIdRequest withPathParams(GetWebhooksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}