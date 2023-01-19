package .models.operations;



public class GetFileVersionRetentionsResponse {
    public .models.shared.ClientError clientError;
    public GetFileVersionRetentionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFileVersionRetentionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionRetentions fileVersionRetentions;
    public GetFileVersionRetentionsResponse withFileVersionRetentions(.models.shared.FileVersionRetentions fileVersionRetentions) {
        this.fileVersionRetentions = fileVersionRetentions;
        return this;
    }
    public Long statusCode;
    public GetFileVersionRetentionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}