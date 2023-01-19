package .models.operations;



public class PostSignRequestsIdCancelRequest {
    public .models.utils.RetryConfig retries;
    public PostSignRequestsIdCancelRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostSignRequestsIdCancelPathParams pathParams;
    public PostSignRequestsIdCancelRequest withPathParams(PostSignRequestsIdCancelPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}