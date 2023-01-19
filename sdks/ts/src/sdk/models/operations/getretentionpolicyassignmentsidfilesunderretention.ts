import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_assignment_id" })
  retentionPolicyAssignmentId: string;
}


export class GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;
}


export class GetRetentionPolicyAssignmentsIdFilesUnderRetentionRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetRetentionPolicyAssignmentsIdFilesUnderRetentionPathParams;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams;
}


export class GetRetentionPolicyAssignmentsIdFilesUnderRetentionResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  filesUnderRetention?: shared.FilesUnderRetention;

  @SpeakeasyMetadata()
  statusCode: number;
}
