package .models.operations;



public class GetMetadataTemplatesEnterpriseResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesEnterpriseResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesEnterpriseResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplates metadataTemplates;
    public GetMetadataTemplatesEnterpriseResponse withMetadataTemplates(.models.shared.MetadataTemplates metadataTemplates) {
        this.metadataTemplates = metadataTemplates;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesEnterpriseResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}