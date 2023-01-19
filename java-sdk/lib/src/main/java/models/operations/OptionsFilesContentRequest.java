package .models.operations;

import .utils.SpeakeasyMetadata;

public class OptionsFilesContentRequest {
    public .models.utils.RetryConfig retries;
    public OptionsFilesContentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public OptionsFilesContentRequestBody request;
    public OptionsFilesContentRequest withRequest(OptionsFilesContentRequestBody request) {
        this.request = request;
        return this;
    }
}