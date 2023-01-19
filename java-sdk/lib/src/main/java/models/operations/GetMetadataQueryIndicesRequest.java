package .models.operations;



public class GetMetadataQueryIndicesRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataQueryIndicesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataQueryIndicesQueryParams queryParams;
    public GetMetadataQueryIndicesRequest withQueryParams(GetMetadataQueryIndicesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}