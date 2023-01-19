package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withPathParams(PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[] request;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRequest(PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[] request) {
        this.request = request;
        return this;
    }
}