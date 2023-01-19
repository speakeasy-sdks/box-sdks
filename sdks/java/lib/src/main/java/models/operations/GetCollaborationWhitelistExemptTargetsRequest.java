package .models.operations;



public class GetCollaborationWhitelistExemptTargetsRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationWhitelistExemptTargetsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationWhitelistExemptTargetsQueryParams queryParams;
    public GetCollaborationWhitelistExemptTargetsRequest withQueryParams(GetCollaborationWhitelistExemptTargetsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}