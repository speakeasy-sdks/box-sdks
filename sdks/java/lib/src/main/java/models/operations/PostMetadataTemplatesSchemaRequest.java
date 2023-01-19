package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostMetadataTemplatesSchemaRequest {
    public .models.utils.RetryConfig retries;
    public PostMetadataTemplatesSchemaRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostMetadataTemplatesSchemaRequestBody request;
    public PostMetadataTemplatesSchemaRequest withRequest(PostMetadataTemplatesSchemaRequestBody request) {
        this.request = request;
        return this;
    }
}