import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierSegmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_segment_id" })
  shieldInformationBarrierSegmentId: string;
}


export class GetShieldInformationBarrierSegmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetShieldInformationBarrierSegmentsIdPathParams;
}


export class GetShieldInformationBarrierSegmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegment?: shared.ShieldInformationBarrierSegment;

  @SpeakeasyMetadata()
  statusCode: number;
}
