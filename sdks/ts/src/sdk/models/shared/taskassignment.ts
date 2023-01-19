import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { FileMini } from "./filemini";


export enum TaskAssignmentResolutionStateEnum {
    Completed = "completed",
    Incomplete = "incomplete",
    Approved = "approved",
    Rejected = "rejected"
}

export enum TaskAssignmentTypeEnum {
    TaskAssignment = "task_assignment"
}


// TaskAssignment
/** 
 * A task assignment defines which task is assigned to which user to complete.
**/
export class TaskAssignment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assigned_at" })
  assignedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=assigned_by" })
  assignedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=assigned_to" })
  assignedTo?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=completed_at" })
  completedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;

  @SpeakeasyMetadata({ data: "json, name=reminded_at" })
  remindedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=resolution_state" })
  resolutionState?: TaskAssignmentResolutionStateEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TaskAssignmentTypeEnum;
}
