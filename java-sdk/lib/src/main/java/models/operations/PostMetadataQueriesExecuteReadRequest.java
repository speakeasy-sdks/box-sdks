package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostMetadataQueriesExecuteReadRequest {
    public .models.utils.RetryConfig retries;
    public PostMetadataQueriesExecuteReadRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.MetadataQuery request;
    public PostMetadataQueriesExecuteReadRequest withRequest(.models.shared.MetadataQuery request) {
        this.request = request;
        return this;
    }
}