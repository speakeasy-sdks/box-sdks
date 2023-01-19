package .models.operations;



public class GetMetadataTemplatesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataTemplatesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataTemplatesIdPathParams pathParams;
    public GetMetadataTemplatesIdRequest withPathParams(GetMetadataTemplatesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}