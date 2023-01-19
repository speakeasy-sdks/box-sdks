package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withPathParams(PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[] request;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest withRequest(PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody[] request) {
        this.request = request;
        return this;
    }
}