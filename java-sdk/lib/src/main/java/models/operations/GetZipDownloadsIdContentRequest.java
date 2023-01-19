package .models.operations;



public class GetZipDownloadsIdContentRequest {
    public .models.utils.RetryConfig retries;
    public GetZipDownloadsIdContentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public GetZipDownloadsIdContentRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public GetZipDownloadsIdContentPathParams pathParams;
    public GetZipDownloadsIdContentRequest withPathParams(GetZipDownloadsIdContentPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}