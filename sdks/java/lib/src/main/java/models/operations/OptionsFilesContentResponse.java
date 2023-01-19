package .models.operations;



public class OptionsFilesContentResponse {
    public .models.shared.ClientError clientError;
    public OptionsFilesContentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.ConflictError conflictError;
    public OptionsFilesContentResponse withConflictError(.models.shared.ConflictError conflictError) {
        this.conflictError = conflictError;
        return this;
    }
    public String contentType;
    public OptionsFilesContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public OptionsFilesContentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadUrl uploadUrl;
    public OptionsFilesContentResponse withUploadUrl(.models.shared.UploadUrl uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
}