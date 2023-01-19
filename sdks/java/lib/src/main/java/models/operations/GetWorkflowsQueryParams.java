package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWorkflowsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=folder_id")
    public String folderId;
    public GetWorkflowsQueryParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetWorkflowsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetWorkflowsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=trigger_type")
    public String triggerType;
    public GetWorkflowsQueryParams withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
}