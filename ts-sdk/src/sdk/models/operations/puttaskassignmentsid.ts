import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutTaskAssignmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=task_assignment_id" })
  taskAssignmentId: string;
}

export enum PutTaskAssignmentsIdRequestBodyResolutionStateEnum {
    Completed = "completed",
    Incomplete = "incomplete",
    Approved = "approved",
    Rejected = "rejected"
}


export class PutTaskAssignmentsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;

  @SpeakeasyMetadata({ data: "json, name=resolution_state" })
  resolutionState?: PutTaskAssignmentsIdRequestBodyResolutionStateEnum;
}


export class PutTaskAssignmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutTaskAssignmentsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutTaskAssignmentsIdRequestBody;
}


export class PutTaskAssignmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  taskAssignment?: shared.TaskAssignment;
}
