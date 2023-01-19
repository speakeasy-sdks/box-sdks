import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Task } from "./task";



// Tasks
/** 
 * A list of tasks
**/
export class Tasks extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Task })
  entries?: Task[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
