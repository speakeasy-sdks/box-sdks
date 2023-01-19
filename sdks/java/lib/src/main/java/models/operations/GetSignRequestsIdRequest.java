package .models.operations;



public class GetSignRequestsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetSignRequestsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetSignRequestsIdPathParams pathParams;
    public GetSignRequestsIdRequest withPathParams(GetSignRequestsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}