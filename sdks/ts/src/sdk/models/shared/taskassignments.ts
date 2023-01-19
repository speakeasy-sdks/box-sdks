import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { TaskAssignment } from "./taskassignment";



// TaskAssignments
/** 
 * A list of task assignments
**/
export class TaskAssignments extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TaskAssignment })
  entries?: TaskAssignment[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
