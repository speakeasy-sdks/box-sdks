package .models.operations;



public class GetFileVersionRetentionsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFileVersionRetentionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFileVersionRetentionsIdPathParams pathParams;
    public GetFileVersionRetentionsIdRequest withPathParams(GetFileVersionRetentionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}