import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=legal_hold_policy_assignment_id" })
  legalHoldPolicyAssignmentId: string;
}


export class GetLegalHoldPolicyAssignmentsIdFilesOnHoldQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;
}


export class GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetLegalHoldPolicyAssignmentsIdFilesOnHoldPathParams;

  @SpeakeasyMetadata()
  queryParams: GetLegalHoldPolicyAssignmentsIdFilesOnHoldQueryParams;
}


export class GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersionLegalHolds?: shared.FileVersionLegalHolds;

  @SpeakeasyMetadata()
  statusCode: number;
}
