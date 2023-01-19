import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetLegalHoldPoliciesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=legal_hold_policy_id" })
  legalHoldPolicyId: string;
}


export class GetLegalHoldPoliciesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetLegalHoldPoliciesIdPathParams;
}


export class GetLegalHoldPoliciesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicy?: shared.LegalHoldPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
