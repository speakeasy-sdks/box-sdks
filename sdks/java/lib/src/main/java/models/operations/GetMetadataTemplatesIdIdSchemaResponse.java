package .models.operations;



public class GetMetadataTemplatesIdIdSchemaResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesIdIdSchemaResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesIdIdSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplate metadataTemplate;
    public GetMetadataTemplatesIdIdSchemaResponse withMetadataTemplate(.models.shared.MetadataTemplate metadataTemplate) {
        this.metadataTemplate = metadataTemplate;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesIdIdSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}