package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesUploadSessionsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesUploadSessionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PutFilesUploadSessionsIdRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public PutFilesUploadSessionsIdPathParams pathParams;
    public PutFilesUploadSessionsIdRequest withPathParams(PutFilesUploadSessionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFilesUploadSessionsIdHeaders headers;
    public PutFilesUploadSessionsIdRequest withHeaders(PutFilesUploadSessionsIdHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/octet-stream")
    public byte[] request;
    public PutFilesUploadSessionsIdRequest withRequest(byte[] request) {
        this.request = request;
        return this;
    }
}