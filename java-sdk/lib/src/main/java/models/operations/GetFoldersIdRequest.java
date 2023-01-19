package .models.operations;



public class GetFoldersIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdPathParams pathParams;
    public GetFoldersIdRequest withPathParams(GetFoldersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFoldersIdQueryParams queryParams;
    public GetFoldersIdRequest withQueryParams(GetFoldersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetFoldersIdHeaders headers;
    public GetFoldersIdRequest withHeaders(GetFoldersIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}