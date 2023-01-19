package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostMetadataTemplatesSchemaNumberClassificationsRequest {
    public .models.utils.RetryConfig retries;
    public PostMetadataTemplatesSchemaNumberClassificationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody request;
    public PostMetadataTemplatesSchemaNumberClassificationsRequest withRequest(PostMetadataTemplatesSchemaNumberClassificationsRequestBody request) {
        this.request = request;
        return this;
    }
}