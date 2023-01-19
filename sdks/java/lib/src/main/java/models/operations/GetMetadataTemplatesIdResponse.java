package .models.operations;



public class GetMetadataTemplatesIdResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataTemplatesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataTemplatesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataTemplate metadataTemplate;
    public GetMetadataTemplatesIdResponse withMetadataTemplate(.models.shared.MetadataTemplate metadataTemplate) {
        this.metadataTemplate = metadataTemplate;
        return this;
    }
    public Long statusCode;
    public GetMetadataTemplatesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}