package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdAvatarRequest {
    public .models.utils.RetryConfig retries;
    public PostUsersIdAvatarRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostUsersIdAvatarPathParams pathParams;
    public PostUsersIdAvatarRequest withPathParams(PostUsersIdAvatarPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public PostUsersIdAvatarRequestBody request;
    public PostUsersIdAvatarRequest withRequest(PostUsersIdAvatarRequestBody request) {
        this.request = request;
        return this;
    }
}