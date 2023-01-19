package .models.operations;



public class PutFilesIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutFilesIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Watermark watermark;
    public PutFilesIdWatermarkResponse withWatermark(.models.shared.Watermark watermark) {
        this.watermark = watermark;
        return this;
    }
}