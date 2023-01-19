package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostOauth2RevokeRequest {
    public .models.utils.RetryConfig retries;
    public PostOauth2RevokeRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostOauth2RevokeRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public .models.shared.PostOAuth2Revoke request;
    public PostOauth2RevokeRequest withRequest(.models.shared.PostOAuth2Revoke request) {
        this.request = request;
        return this;
    }
}