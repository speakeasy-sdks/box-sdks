package .models.operations;



public class GetFileVersionLegalHoldsResponse {
    public .models.shared.ClientError clientError;
    public GetFileVersionLegalHoldsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFileVersionLegalHoldsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionLegalHolds fileVersionLegalHolds;
    public GetFileVersionLegalHoldsResponse withFileVersionLegalHolds(.models.shared.FileVersionLegalHolds fileVersionLegalHolds) {
        this.fileVersionLegalHolds = fileVersionLegalHolds;
        return this;
    }
    public Long statusCode;
    public GetFileVersionLegalHoldsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}