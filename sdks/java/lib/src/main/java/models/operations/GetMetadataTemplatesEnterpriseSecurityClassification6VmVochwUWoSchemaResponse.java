package .models.operations;



public class GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse {
    public .models.shared.ClassificationTemplate classificationTemplate;
    public GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse withClassificationTemplate(.models.shared.ClassificationTemplate classificationTemplate) {
        this.classificationTemplate = classificationTemplate;
        return this;
    }
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}