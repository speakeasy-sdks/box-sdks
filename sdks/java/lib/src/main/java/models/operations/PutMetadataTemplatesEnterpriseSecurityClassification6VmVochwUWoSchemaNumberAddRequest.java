package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest {
    public .models.utils.RetryConfig retries;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody[] request;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest withRequest(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody[] request) {
        this.request = request;
        return this;
    }
}