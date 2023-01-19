package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTasksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_id")
    public String taskId;
    public PutTasksIdPathParams withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
}