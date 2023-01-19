package .models.operations;



public class PostMetadataTemplatesSchemaResponse {
    public .models.shared.ClientError clientError;
    public PostMetadataTemplatesSchemaResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostMetadataTemplatesSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplate metadataTemplate;
    public PostMetadataTemplatesSchemaResponse withMetadataTemplate(.models.shared.MetadataTemplate metadataTemplate) {
        this.metadataTemplate = metadataTemplate;
        return this;
    }
    public Long statusCode;
    public PostMetadataTemplatesSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}