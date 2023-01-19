package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTasksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_id")
    public String taskId;
    public GetTasksIdPathParams withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
}