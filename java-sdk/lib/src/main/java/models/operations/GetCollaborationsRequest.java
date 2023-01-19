package .models.operations;



public class GetCollaborationsRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationsQueryParams queryParams;
    public GetCollaborationsRequest withQueryParams(GetCollaborationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}