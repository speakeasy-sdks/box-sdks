package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteTasksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_id")
    public String taskId;
    public DeleteTasksIdPathParams withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
}