package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCollaborationsRequest {
    public .models.utils.RetryConfig retries;
    public PostCollaborationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostCollaborationsQueryParams queryParams;
    public PostCollaborationsRequest withQueryParams(PostCollaborationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostCollaborationsRequestBody request;
    public PostCollaborationsRequest withRequest(PostCollaborationsRequestBody request) {
        this.request = request;
        return this;
    }
}