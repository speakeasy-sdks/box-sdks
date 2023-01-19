package .models.operations;



public class GetFilesIdMetadataRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdMetadataRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdMetadataPathParams pathParams;
    public GetFilesIdMetadataRequest withPathParams(GetFilesIdMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}