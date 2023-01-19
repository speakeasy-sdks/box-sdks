package .models.operations;



public class PostMetadataQueriesExecuteReadResponse {
    public .models.shared.ClientError clientError;
    public PostMetadataQueriesExecuteReadResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostMetadataQueriesExecuteReadResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataQueryResults metadataQueryResults;
    public PostMetadataQueriesExecuteReadResponse withMetadataQueryResults(.models.shared.MetadataQueryResults metadataQueryResults) {
        this.metadataQueryResults = metadataQueryResults;
        return this;
    }
    public Long statusCode;
    public PostMetadataQueriesExecuteReadResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}