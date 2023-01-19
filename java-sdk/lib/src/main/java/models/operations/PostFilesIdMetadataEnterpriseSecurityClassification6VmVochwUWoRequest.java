package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams;
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withPathParams(PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody request;
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRequest(PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody request) {
        this.request = request;
        return this;
    }
}