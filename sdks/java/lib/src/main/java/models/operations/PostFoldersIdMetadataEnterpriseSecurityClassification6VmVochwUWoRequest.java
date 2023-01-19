package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest {
    public .models.utils.RetryConfig retries;
    public PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams;
    public PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withPathParams(PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody request;
    public PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRequest(PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody request) {
        this.request = request;
        return this;
    }
}