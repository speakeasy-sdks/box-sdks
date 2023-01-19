import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostShieldInformationBarrierSegmentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier: shared.ShieldInformationBarrierBase;
}


export class PostShieldInformationBarrierSegmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostShieldInformationBarrierSegmentsRequestBody;
}


export class PostShieldInformationBarrierSegmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegment?: shared.ShieldInformationBarrierSegment;

  @SpeakeasyMetadata()
  statusCode: number;
}
