package .models.operations;



public class DeleteMetadataTemplatesIdIdSchemaResponse {
    public .models.shared.ClientError clientError;
    public DeleteMetadataTemplatesIdIdSchemaResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteMetadataTemplatesIdIdSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteMetadataTemplatesIdIdSchemaResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}