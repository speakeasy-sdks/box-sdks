package .models.operations;



public class DeleteCollaborationWhitelistExemptTargetsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteCollaborationWhitelistExemptTargetsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteCollaborationWhitelistExemptTargetsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteCollaborationWhitelistExemptTargetsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}