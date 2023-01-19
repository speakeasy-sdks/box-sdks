package .models.operations;



public class GetFilesIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdWatermarkPathParams pathParams;
    public GetFilesIdWatermarkRequest withPathParams(GetFilesIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}