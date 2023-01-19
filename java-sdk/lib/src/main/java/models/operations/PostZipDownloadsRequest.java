package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostZipDownloadsRequest {
    public .models.utils.RetryConfig retries;
    public PostZipDownloadsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ZipDownloadRequest request;
    public PostZipDownloadsRequest withRequest(.models.shared.ZipDownloadRequest request) {
        this.request = request;
        return this;
    }
}