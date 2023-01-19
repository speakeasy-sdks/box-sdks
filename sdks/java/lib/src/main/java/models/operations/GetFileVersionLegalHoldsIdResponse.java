package .models.operations;



public class GetFileVersionLegalHoldsIdResponse {
    public .models.shared.ClientError clientError;
    public GetFileVersionLegalHoldsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFileVersionLegalHoldsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersionLegalHold fileVersionLegalHold;
    public GetFileVersionLegalHoldsIdResponse withFileVersionLegalHold(.models.shared.FileVersionLegalHold fileVersionLegalHold) {
        this.fileVersionLegalHold = fileVersionLegalHold;
        return this;
    }
    public Long statusCode;
    public GetFileVersionLegalHoldsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}