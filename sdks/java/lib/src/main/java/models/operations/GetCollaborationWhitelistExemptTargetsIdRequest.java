package .models.operations;



public class GetCollaborationWhitelistExemptTargetsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationWhitelistExemptTargetsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationWhitelistExemptTargetsIdPathParams pathParams;
    public GetCollaborationWhitelistExemptTargetsIdRequest withPathParams(GetCollaborationWhitelistExemptTargetsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}