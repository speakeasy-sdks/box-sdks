package .models.operations;



public class GetFilesIdVersionsRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdVersionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdVersionsPathParams pathParams;
    public GetFilesIdVersionsRequest withPathParams(GetFilesIdVersionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdVersionsQueryParams queryParams;
    public GetFilesIdVersionsRequest withQueryParams(GetFilesIdVersionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}