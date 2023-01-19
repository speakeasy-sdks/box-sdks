package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdPathParams pathParams;
    public PutFoldersIdRequest withPathParams(PutFoldersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFoldersIdQueryParams queryParams;
    public PutFoldersIdRequest withQueryParams(PutFoldersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public PutFoldersIdHeaders headers;
    public PutFoldersIdRequest withHeaders(PutFoldersIdHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFoldersIdRequestBody request;
    public PutFoldersIdRequest withRequest(PutFoldersIdRequestBody request) {
        this.request = request;
        return this;
    }
}