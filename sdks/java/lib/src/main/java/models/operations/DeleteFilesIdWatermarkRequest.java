package .models.operations;



public class DeleteFilesIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFilesIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFilesIdWatermarkPathParams pathParams;
    public DeleteFilesIdWatermarkRequest withPathParams(DeleteFilesIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}