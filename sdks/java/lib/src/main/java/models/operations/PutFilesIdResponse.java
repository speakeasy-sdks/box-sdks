package .models.operations;



public class PutFilesIdResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public PutFilesIdResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public PutFilesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}