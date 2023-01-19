package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest {
    public .models.utils.RetryConfig retries;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody[] request;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest withRequest(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody[] request) {
        this.request = request;
        return this;
    }
}