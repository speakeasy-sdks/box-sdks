package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWorkflowsIdStartRequest {
    public .models.utils.RetryConfig retries;
    public PostWorkflowsIdStartRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostWorkflowsIdStartPathParams pathParams;
    public PostWorkflowsIdStartRequest withPathParams(PostWorkflowsIdStartPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostWorkflowsIdStartRequestBody request;
    public PostWorkflowsIdStartRequest withRequest(PostWorkflowsIdStartRequestBody request) {
        this.request = request;
        return this;
    }
}