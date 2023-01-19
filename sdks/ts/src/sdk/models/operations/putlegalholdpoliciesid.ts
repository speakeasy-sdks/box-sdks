import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutLegalHoldPoliciesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=legal_hold_policy_id" })
  legalHoldPolicyId: string;
}


export class PutLegalHoldPoliciesIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "json, name=release_notes" })
  releaseNotes?: string;
}


export class PutLegalHoldPoliciesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutLegalHoldPoliciesIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutLegalHoldPoliciesIdRequestBody;
}


export class PutLegalHoldPoliciesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicy?: shared.LegalHoldPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
