import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetRetentionPolicyAssignmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_assignment_id" })
  retentionPolicyAssignmentId: string;
}


export class GetRetentionPolicyAssignmentsIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetRetentionPolicyAssignmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetRetentionPolicyAssignmentsIdPathParams;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPolicyAssignmentsIdQueryParams;
}


export class GetRetentionPolicyAssignmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicyAssignment?: shared.RetentionPolicyAssignment;

  @SpeakeasyMetadata()
  statusCode: number;
}
