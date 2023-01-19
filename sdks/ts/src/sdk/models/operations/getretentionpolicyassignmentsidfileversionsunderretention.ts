import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_assignment_id" })
  retentionPolicyAssignmentId: string;
}


export class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;
}


export class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionPathParams;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams;
}


export class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  filesUnderRetention?: shared.FilesUnderRetention;

  @SpeakeasyMetadata()
  statusCode: number;
}
