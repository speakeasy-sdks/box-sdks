package .models.operations;



public class GetMetadataTemplatesEnterpriseRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataTemplatesEnterpriseRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataTemplatesEnterpriseQueryParams queryParams;
    public GetMetadataTemplatesEnterpriseRequest withQueryParams(GetMetadataTemplatesEnterpriseQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}