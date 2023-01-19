package .models.operations;



public class GetMetadataTemplatesGlobalRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataTemplatesGlobalRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataTemplatesGlobalQueryParams queryParams;
    public GetMetadataTemplatesGlobalRequest withQueryParams(GetMetadataTemplatesGlobalQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}