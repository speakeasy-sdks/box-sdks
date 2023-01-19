package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWorkflowsIdStartPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflow_id")
    public String workflowId;
    public PostWorkflowsIdStartPathParams withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
}