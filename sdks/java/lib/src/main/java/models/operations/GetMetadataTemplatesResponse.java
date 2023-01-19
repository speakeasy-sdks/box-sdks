package .models.operations;



public class GetMetadataTemplatesResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplates metadataTemplates;
    public GetMetadataTemplatesResponse withMetadataTemplates(.models.shared.MetadataTemplates metadataTemplates) {
        this.metadataTemplates = metadataTemplates;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}