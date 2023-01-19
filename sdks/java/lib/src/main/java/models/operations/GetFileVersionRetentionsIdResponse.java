package .models.operations;



public class GetFileVersionRetentionsIdResponse {
    public .models.shared.ClientError clientError;
    public GetFileVersionRetentionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFileVersionRetentionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionRetention fileVersionRetention;
    public GetFileVersionRetentionsIdResponse withFileVersionRetention(.models.shared.FileVersionRetention fileVersionRetention) {
        this.fileVersionRetention = fileVersionRetention;
        return this;
    }
    public Long statusCode;
    public GetFileVersionRetentionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}