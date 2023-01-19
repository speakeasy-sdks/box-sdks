package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutCollaborationsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutCollaborationsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutCollaborationsIdPathParams pathParams;
    public PutCollaborationsIdRequest withPathParams(PutCollaborationsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutCollaborationsIdRequestBody request;
    public PutCollaborationsIdRequest withRequest(PutCollaborationsIdRequestBody request) {
        this.request = request;
        return this;
    }
}