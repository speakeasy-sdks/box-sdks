package .models.operations;



public class DeleteCollaborationWhitelistEntriesIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteCollaborationWhitelistEntriesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteCollaborationWhitelistEntriesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteCollaborationWhitelistEntriesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}