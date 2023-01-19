package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWebLinksIdRequest {
    public .models.utils.RetryConfig retries;
    public PostWebLinksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostWebLinksIdPathParams pathParams;
    public PostWebLinksIdRequest withPathParams(PostWebLinksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostWebLinksIdQueryParams queryParams;
    public PostWebLinksIdRequest withQueryParams(PostWebLinksIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostWebLinksIdRequestBody request;
    public PostWebLinksIdRequest withRequest(PostWebLinksIdRequestBody request) {
        this.request = request;
        return this;
    }
}