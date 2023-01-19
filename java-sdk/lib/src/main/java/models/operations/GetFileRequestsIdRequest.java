package .models.operations;



public class GetFileRequestsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFileRequestsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFileRequestsIdPathParams pathParams;
    public GetFileRequestsIdRequest withPathParams(GetFileRequestsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}