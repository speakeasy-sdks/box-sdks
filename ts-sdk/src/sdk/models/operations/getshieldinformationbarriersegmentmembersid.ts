import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetShieldInformationBarrierSegmentMembersIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=shield_information_barrier_segment_member_id" })
  shieldInformationBarrierSegmentMemberId: string;
}


export class GetShieldInformationBarrierSegmentMembersIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetShieldInformationBarrierSegmentMembersIdPathParams;
}


export class GetShieldInformationBarrierSegmentMembersIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegmentMember?: shared.ShieldInformationBarrierSegmentMember;

  @SpeakeasyMetadata()
  statusCode: number;
}
