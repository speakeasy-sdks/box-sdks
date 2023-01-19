package .models.operations;



public class GetWebLinksIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public GetWebLinksIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWebLinksIdTrashPathParams pathParams;
    public GetWebLinksIdTrashRequest withPathParams(GetWebLinksIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetWebLinksIdTrashQueryParams queryParams;
    public GetWebLinksIdTrashRequest withQueryParams(GetWebLinksIdTrashQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}