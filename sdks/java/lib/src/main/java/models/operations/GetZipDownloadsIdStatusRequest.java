package .models.operations;



public class GetZipDownloadsIdStatusRequest {
    public .models.utils.RetryConfig retries;
    public GetZipDownloadsIdStatusRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetZipDownloadsIdStatusPathParams pathParams;
    public GetZipDownloadsIdStatusRequest withPathParams(GetZipDownloadsIdStatusPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}