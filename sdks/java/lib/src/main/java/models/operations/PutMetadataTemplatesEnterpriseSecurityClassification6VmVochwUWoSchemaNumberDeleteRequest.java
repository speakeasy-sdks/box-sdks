package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest {
    public .models.utils.RetryConfig retries;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody[] request;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest withRequest(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody[] request) {
        this.request = request;
        return this;
    }
}