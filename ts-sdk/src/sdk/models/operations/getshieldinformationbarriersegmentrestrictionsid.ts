import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierSegmentRestrictionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_segment_restriction_id" })
  shieldInformationBarrierSegmentRestrictionId: string;
}


export class GetShieldInformationBarrierSegmentRestrictionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetShieldInformationBarrierSegmentRestrictionsIdPathParams;
}


export class GetShieldInformationBarrierSegmentRestrictionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegmentRestriction?: shared.ShieldInformationBarrierSegmentRestriction;

  @SpeakeasyMetadata()
  statusCode: number;
}
