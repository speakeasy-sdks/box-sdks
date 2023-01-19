package .models.operations;



public class GetMetadataTemplatesIdIdSchemaRequest {
    public .models.utils.RetryConfig retries;
    public GetMetadataTemplatesIdIdSchemaRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetMetadataTemplatesIdIdSchemaPathParams pathParams;
    public GetMetadataTemplatesIdIdSchemaRequest withPathParams(GetMetadataTemplatesIdIdSchemaPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}