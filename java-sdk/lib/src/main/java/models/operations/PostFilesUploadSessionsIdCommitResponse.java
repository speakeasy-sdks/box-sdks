package .models.operations;



public class PostFilesUploadSessionsIdCommitResponse {
    public .models.shared.ClientError clientError;
    public PostFilesUploadSessionsIdCommitResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesUploadSessionsIdCommitResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Files files;
    public PostFilesUploadSessionsIdCommitResponse withFiles(.models.shared.Files files) {
        this.files = files;
        return this;
    }
    public java.util.Map<String, String[]> headers;
    public PostFilesUploadSessionsIdCommitResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    public Long statusCode;
    public PostFilesUploadSessionsIdCommitResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}