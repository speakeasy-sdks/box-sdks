package .models.operations;



public class GetCollaborationWhitelistEntriesIdResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationWhitelistEntriesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistEntry collaborationAllowlistEntry;
    public GetCollaborationWhitelistEntriesIdResponse withCollaborationAllowlistEntry(.models.shared.CollaborationAllowlistEntry collaborationAllowlistEntry) {
        this.collaborationAllowlistEntry = collaborationAllowlistEntry;
        return this;
    }
    public String contentType;
    public GetCollaborationWhitelistEntriesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationWhitelistEntriesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}