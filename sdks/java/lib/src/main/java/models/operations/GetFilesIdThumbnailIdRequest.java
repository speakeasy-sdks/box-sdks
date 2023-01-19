package .models.operations;



public class GetFilesIdThumbnailIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdThumbnailIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdThumbnailIdPathParams pathParams;
    public GetFilesIdThumbnailIdRequest withPathParams(GetFilesIdThumbnailIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdThumbnailIdQueryParams queryParams;
    public GetFilesIdThumbnailIdRequest withQueryParams(GetFilesIdThumbnailIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}