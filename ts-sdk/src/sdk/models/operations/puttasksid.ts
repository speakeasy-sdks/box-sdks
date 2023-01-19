import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutTasksIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=task_id" })
  taskId: string;
}

export enum PutTasksIdRequestBodyActionEnum {
    Review = "review",
    Complete = "complete"
}

export enum PutTasksIdRequestBodyCompletionRuleEnum {
    AllAssignees = "all_assignees",
    AnyAssignee = "any_assignee"
}


export class PutTasksIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=action" })
  action?: PutTasksIdRequestBodyActionEnum;

  @SpeakeasyMetadata({ data: "json, name=completion_rule" })
  completionRule?: PutTasksIdRequestBodyCompletionRuleEnum;

  @SpeakeasyMetadata({ data: "json, name=due_at" })
  dueAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}


export class PutTasksIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutTasksIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutTasksIdRequestBody;
}


export class PutTasksIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  task?: shared.Task;
}
