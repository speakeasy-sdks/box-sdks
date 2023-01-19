import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostTasksRequestBodyActionEnum {
    Review = "review",
    Complete = "complete"
}

export enum PostTasksRequestBodyCompletionRuleEnum {
    AllAssignees = "all_assignees",
    AnyAssignee = "any_assignee"
}

export enum PostTasksRequestBodyItemTypeEnum {
    File = "file"
}


// PostTasksRequestBodyItem
/** 
 * The file to attach the task to.
**/
export class PostTasksRequestBodyItem extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostTasksRequestBodyItemTypeEnum;
}


export class PostTasksRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=action" })
  action?: PostTasksRequestBodyActionEnum;

  @SpeakeasyMetadata({ data: "json, name=completion_rule" })
  completionRule?: PostTasksRequestBodyCompletionRuleEnum;

  @SpeakeasyMetadata({ data: "json, name=due_at" })
  dueAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item: PostTasksRequestBodyItem;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}


export class PostTasksRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostTasksRequestBody;
}


export class PostTasksResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  task?: shared.Task;
}
