package .models.operations;



public class GetFilesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdPathParams pathParams;
    public GetFilesIdRequest withPathParams(GetFilesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdQueryParams queryParams;
    public GetFilesIdRequest withQueryParams(GetFilesIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetFilesIdHeaders headers;
    public GetFilesIdRequest withHeaders(GetFilesIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}