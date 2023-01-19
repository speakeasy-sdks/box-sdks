package .models.operations;



public class GetEventsRequest {
    public .models.utils.RetryConfig retries;
    public GetEventsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetEventsQueryParams queryParams;
    public GetEventsRequest withQueryParams(GetEventsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}