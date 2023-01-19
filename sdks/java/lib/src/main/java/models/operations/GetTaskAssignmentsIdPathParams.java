package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTaskAssignmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task_assignment_id")
    public String taskAssignmentId;
    public GetTaskAssignmentsIdPathParams withTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
        return this;
    }
}