package .models.operations;



public class PostSignRequestsIdResendRequest {
    public .models.utils.RetryConfig retries;
    public PostSignRequestsIdResendRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostSignRequestsIdResendPathParams pathParams;
    public PostSignRequestsIdResendRequest withPathParams(PostSignRequestsIdResendPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}