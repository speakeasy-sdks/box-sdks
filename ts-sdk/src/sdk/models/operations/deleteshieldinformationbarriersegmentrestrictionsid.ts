import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class DeleteShieldInformationBarrierSegmentRestrictionsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_segment_restriction_id" })
  shieldInformationBarrierSegmentRestrictionId: string;
}


export class DeleteShieldInformationBarrierSegmentRestrictionsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: DeleteShieldInformationBarrierSegmentRestrictionsIdPathParams;
}


export class DeleteShieldInformationBarrierSegmentRestrictionsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
