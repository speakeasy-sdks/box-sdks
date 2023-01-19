package .models.operations;



public class DeleteFoldersIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFoldersIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFoldersIdWatermarkPathParams pathParams;
    public DeleteFoldersIdWatermarkRequest withPathParams(DeleteFoldersIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}