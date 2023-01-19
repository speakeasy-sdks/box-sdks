package .models.operations;



public class GetWorkflowsRequest {
    public .models.utils.RetryConfig retries;
    public GetWorkflowsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWorkflowsQueryParams queryParams;
    public GetWorkflowsRequest withQueryParams(GetWorkflowsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}