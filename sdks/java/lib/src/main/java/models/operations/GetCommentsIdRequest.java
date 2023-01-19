package .models.operations;



public class GetCommentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetCommentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCommentsIdPathParams pathParams;
    public GetCommentsIdRequest withPathParams(GetCommentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetCommentsIdQueryParams queryParams;
    public GetCommentsIdRequest withQueryParams(GetCommentsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}