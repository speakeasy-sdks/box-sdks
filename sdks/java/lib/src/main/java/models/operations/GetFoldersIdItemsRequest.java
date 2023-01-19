package .models.operations;



public class GetFoldersIdItemsRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdItemsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdItemsPathParams pathParams;
    public GetFoldersIdItemsRequest withPathParams(GetFoldersIdItemsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFoldersIdItemsQueryParams queryParams;
    public GetFoldersIdItemsRequest withQueryParams(GetFoldersIdItemsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetFoldersIdItemsHeaders headers;
    public GetFoldersIdItemsRequest withHeaders(GetFoldersIdItemsHeaders headers) {
        this.headers = headers;
        return this;
    }
}