package .models.operations;



public class GetWebhooksRequest {
    public .models.utils.RetryConfig retries;
    public GetWebhooksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWebhooksQueryParams queryParams;
    public GetWebhooksRequest withQueryParams(GetWebhooksQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}