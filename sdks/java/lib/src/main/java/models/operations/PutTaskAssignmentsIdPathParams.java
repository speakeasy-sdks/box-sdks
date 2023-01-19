package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTaskAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_assignment_id")
    public String taskAssignmentId;
    public PutTaskAssignmentsIdPathParams withTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
        return this;
    }
}