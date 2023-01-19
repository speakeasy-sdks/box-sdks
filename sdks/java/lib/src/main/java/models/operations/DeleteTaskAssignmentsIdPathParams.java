package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteTaskAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_assignment_id")
    public String taskAssignmentId;
    public DeleteTaskAssignmentsIdPathParams withTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
        return this;
    }
}