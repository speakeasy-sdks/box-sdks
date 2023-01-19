package .models.operations;



public class GetWorkflowsResponse {
    public .models.shared.ClientError clientError;
    public GetWorkflowsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetWorkflowsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetWorkflowsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Workflows workflows;
    public GetWorkflowsResponse withWorkflows(.models.shared.Workflows workflows) {
        this.workflows = workflows;
        return this;
    }
}