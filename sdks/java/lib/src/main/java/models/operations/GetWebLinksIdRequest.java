package .models.operations;



public class GetWebLinksIdRequest {
    public .models.utils.RetryConfig retries;
    public GetWebLinksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWebLinksIdPathParams pathParams;
    public GetWebLinksIdRequest withPathParams(GetWebLinksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetWebLinksIdHeaders headers;
    public GetWebLinksIdRequest withHeaders(GetWebLinksIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}