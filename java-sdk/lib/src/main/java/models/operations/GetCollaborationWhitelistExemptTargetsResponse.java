package .models.operations;



public class GetCollaborationWhitelistExemptTargetsResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationWhitelistExemptTargetsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistExemptTargets collaborationAllowlistExemptTargets;
    public GetCollaborationWhitelistExemptTargetsResponse withCollaborationAllowlistExemptTargets(.models.shared.CollaborationAllowlistExemptTargets collaborationAllowlistExemptTargets) {
        this.collaborationAllowlistExemptTargets = collaborationAllowlistExemptTargets;
        return this;
    }
    public String contentType;
    public GetCollaborationWhitelistExemptTargetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationWhitelistExemptTargetsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}