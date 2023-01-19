package .models.operations;



public class GetCollectionsIdItemsRequest {
    public .models.utils.RetryConfig retries;
    public GetCollectionsIdItemsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollectionsIdItemsPathParams pathParams;
    public GetCollectionsIdItemsRequest withPathParams(GetCollectionsIdItemsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetCollectionsIdItemsQueryParams queryParams;
    public GetCollectionsIdItemsRequest withQueryParams(GetCollectionsIdItemsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}