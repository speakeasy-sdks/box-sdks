import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PostTaskAssignmentsRequestBodyAssignTo
/** 
 * The user to assign the task to.
**/
export class PostTaskAssignmentsRequestBodyAssignTo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login?: string;
}

export enum PostTaskAssignmentsRequestBodyTaskTypeEnum {
    Task = "task"
}


// PostTaskAssignmentsRequestBodyTask
/** 
 * The task to assign to a user.
**/
export class PostTaskAssignmentsRequestBodyTask extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostTaskAssignmentsRequestBodyTaskTypeEnum;
}


export class PostTaskAssignmentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assign_to" })
  assignTo: PostTaskAssignmentsRequestBodyAssignTo;

  @SpeakeasyMetadata({ data: "json, name=task" })
  task: PostTaskAssignmentsRequestBodyTask;
}


export class PostTaskAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostTaskAssignmentsRequestBody;
}


export class PostTaskAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  taskAssignment?: shared.TaskAssignment;
}
