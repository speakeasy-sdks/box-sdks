package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostOauth2TokenRequest {
    public .models.utils.RetryConfig retries;
    public PostOauth2TokenRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostOauth2TokenRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public .models.shared.PostOAuth2Token request;
    public PostOauth2TokenRequest withRequest(.models.shared.PostOAuth2Token request) {
        this.request = request;
        return this;
    }
}