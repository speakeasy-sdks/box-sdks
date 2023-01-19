package .models.operations;



public class DeleteFilesIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}