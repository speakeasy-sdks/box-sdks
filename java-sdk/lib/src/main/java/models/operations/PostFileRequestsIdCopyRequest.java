package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFileRequestsIdCopyRequest {
    public .models.utils.RetryConfig retries;
    public PostFileRequestsIdCopyRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFileRequestsIdCopyPathParams pathParams;
    public PostFileRequestsIdCopyRequest withPathParams(PostFileRequestsIdCopyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.FileRequestCopyRequest request;
    public PostFileRequestsIdCopyRequest withRequest(.models.shared.FileRequestCopyRequest request) {
        this.request = request;
        return this;
    }
}