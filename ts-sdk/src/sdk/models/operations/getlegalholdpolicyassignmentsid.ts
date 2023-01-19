import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetLegalHoldPolicyAssignmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=legal_hold_policy_assignment_id" })
  legalHoldPolicyAssignmentId: string;
}


export class GetLegalHoldPolicyAssignmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetLegalHoldPolicyAssignmentsIdPathParams;
}


export class GetLegalHoldPolicyAssignmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicyAssignment?: shared.LegalHoldPolicyAssignment;

  @SpeakeasyMetadata()
  statusCode: number;
}
