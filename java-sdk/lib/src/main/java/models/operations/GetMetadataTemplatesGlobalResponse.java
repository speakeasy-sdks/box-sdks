package .models.operations;



public class GetMetadataTemplatesGlobalResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesGlobalResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesGlobalResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplates metadataTemplates;
    public GetMetadataTemplatesGlobalResponse withMetadataTemplates(.models.shared.MetadataTemplates metadataTemplates) {
        this.metadataTemplates = metadataTemplates;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesGlobalResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}