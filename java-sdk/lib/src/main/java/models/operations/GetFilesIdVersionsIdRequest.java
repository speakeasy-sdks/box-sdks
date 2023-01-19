package .models.operations;



public class GetFilesIdVersionsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdVersionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdVersionsIdPathParams pathParams;
    public GetFilesIdVersionsIdRequest withPathParams(GetFilesIdVersionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdVersionsIdQueryParams queryParams;
    public GetFilesIdVersionsIdRequest withQueryParams(GetFilesIdVersionsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}