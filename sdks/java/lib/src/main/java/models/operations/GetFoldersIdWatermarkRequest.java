package .models.operations;



public class GetFoldersIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdWatermarkPathParams pathParams;
    public GetFoldersIdWatermarkRequest withPathParams(GetFoldersIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}