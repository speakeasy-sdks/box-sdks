package .models.operations;



public class GetFoldersIdMetadataRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdMetadataRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdMetadataPathParams pathParams;
    public GetFoldersIdMetadataRequest withPathParams(GetFoldersIdMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}