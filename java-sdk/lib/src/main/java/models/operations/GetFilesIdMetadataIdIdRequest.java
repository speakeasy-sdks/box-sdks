package .models.operations;



public class GetFilesIdMetadataIdIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdMetadataIdIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdMetadataIdIdPathParams pathParams;
    public GetFilesIdMetadataIdIdRequest withPathParams(GetFilesIdMetadataIdIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}