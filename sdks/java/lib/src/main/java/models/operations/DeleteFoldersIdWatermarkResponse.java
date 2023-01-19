package .models.operations;



public class DeleteFoldersIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public DeleteFoldersIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFoldersIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFoldersIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}