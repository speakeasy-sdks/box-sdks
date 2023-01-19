package .models.operations;



public class GetFilesIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Watermark watermark;
    public GetFilesIdWatermarkResponse withWatermark(.models.shared.Watermark watermark) {
        this.watermark = watermark;
        return this;
    }
}