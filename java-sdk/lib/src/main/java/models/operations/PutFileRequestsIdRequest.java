package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFileRequestsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFileRequestsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFileRequestsIdPathParams pathParams;
    public PutFileRequestsIdRequest withPathParams(PutFileRequestsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFileRequestsIdHeaders headers;
    public PutFileRequestsIdRequest withHeaders(PutFileRequestsIdHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.FileRequestUpdateRequest request;
    public PutFileRequestsIdRequest withRequest(.models.shared.FileRequestUpdateRequest request) {
        this.request = request;
        return this;
    }
}