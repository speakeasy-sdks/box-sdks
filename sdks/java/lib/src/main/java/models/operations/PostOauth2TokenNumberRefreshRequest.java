package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostOauth2TokenNumberRefreshRequest {
    public .models.utils.RetryConfig retries;
    public PostOauth2TokenNumberRefreshRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostOauth2TokenNumberRefreshRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public .models.shared.PostOAuth2TokenRefreshAccessToken request;
    public PostOauth2TokenNumberRefreshRequest withRequest(.models.shared.PostOAuth2TokenRefreshAccessToken request) {
        this.request = request;
        return this;
    }
}