package .models.operations;



public class GetFilesIdContentResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdContentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, String[]> headers;
    public GetFilesIdContentResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    public Long statusCode;
    public GetFilesIdContentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}