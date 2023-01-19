package .models.operations;



public class GetMetadataTemplatesRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataTemplatesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataTemplatesQueryParams queryParams;
    public GetMetadataTemplatesRequest withQueryParams(GetMetadataTemplatesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}