package .models.operations;



public class GetAuthorizeRequest {
    public .models.utils.RetryConfig retries;
    public GetAuthorizeRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public GetAuthorizeRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public GetAuthorizeQueryParams queryParams;
    public GetAuthorizeRequest withQueryParams(GetAuthorizeQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}