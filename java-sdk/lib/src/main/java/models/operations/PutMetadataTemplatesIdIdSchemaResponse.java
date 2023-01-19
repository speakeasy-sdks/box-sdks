package .models.operations;



public class PutMetadataTemplatesIdIdSchemaResponse {
    public .models.shared.ClientError clientError;
    public PutMetadataTemplatesIdIdSchemaResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutMetadataTemplatesIdIdSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplate metadataTemplate;
    public PutMetadataTemplatesIdIdSchemaResponse withMetadataTemplate(.models.shared.MetadataTemplate metadataTemplate) {
        this.metadataTemplate = metadataTemplate;
        return this;
    }
    public Long statusCode;
    public PutMetadataTemplatesIdIdSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}