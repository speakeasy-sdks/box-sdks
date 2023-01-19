import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { FileMini } from "./filemini";
import { TaskAssignments } from "./taskassignments";


export enum TaskActionEnum {
    Review = "review",
    Complete = "complete"
}

export enum TaskCompletionRuleEnum {
    AllAssignees = "all_assignees",
    AnyAssignee = "any_assignee"
}

export enum TaskTypeEnum {
    Task = "task"
}


// Task
/** 
 * A task allows for file-centric workflows within Box. Users can
 * create tasks on files and assign them to other users for them to complete the
 * tasks.
**/
export class Task extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=action" })
  action?: TaskActionEnum;

  @SpeakeasyMetadata({ data: "json, name=completion_rule" })
  completionRule?: TaskCompletionRuleEnum;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=due_at" })
  dueAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=is_completed" })
  isCompleted?: boolean;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;

  @SpeakeasyMetadata({ data: "json, name=task_assignment_collection" })
  taskAssignmentCollection?: TaskAssignments;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TaskTypeEnum;
}
