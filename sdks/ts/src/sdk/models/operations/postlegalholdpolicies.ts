import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostLegalHoldPoliciesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=filter_ended_at" })
  filterEndedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=filter_started_at" })
  filterStartedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=is_ongoing" })
  isOngoing?: boolean;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName: string;
}


export class PostLegalHoldPoliciesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostLegalHoldPoliciesRequestBody;
}


export class PostLegalHoldPoliciesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicy?: shared.LegalHoldPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
