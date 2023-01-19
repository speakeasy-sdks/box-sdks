package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutMetadataTemplatesIdIdSchemaRequest {
    public .models.utils.RetryConfig retries;
    public PutMetadataTemplatesIdIdSchemaRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutMetadataTemplatesIdIdSchemaPathParams pathParams;
    public PutMetadataTemplatesIdIdSchemaRequest withPathParams(PutMetadataTemplatesIdIdSchemaPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation[] request;
    public PutMetadataTemplatesIdIdSchemaRequest withRequest(PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation[] request) {
        this.request = request;
        return this;
    }
}