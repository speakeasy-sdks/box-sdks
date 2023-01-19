package .models.operations;



public class PostMetadataTemplatesSchemaNumberClassificationsResponse {
    public .models.shared.ClassificationTemplate classificationTemplate;
    public PostMetadataTemplatesSchemaNumberClassificationsResponse withClassificationTemplate(.models.shared.ClassificationTemplate classificationTemplate) {
        this.classificationTemplate = classificationTemplate;
        return this;
    }
    public .models.shared.ClientError clientError;
    public PostMetadataTemplatesSchemaNumberClassificationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostMetadataTemplatesSchemaNumberClassificationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostMetadataTemplatesSchemaNumberClassificationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}