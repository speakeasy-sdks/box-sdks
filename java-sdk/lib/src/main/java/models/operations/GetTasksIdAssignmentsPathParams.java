package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTasksIdAssignmentsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_id")
    public String taskId;
    public GetTasksIdAssignmentsPathParams withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
}