import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment
/** 
 * The `type` and `id` of the
 * requested shield information barrier segment.
**/
export class PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum;
}

export enum PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum {
    ShieldInformationBarrierSegmentMember = "shield_information_barrier_segment_member"
}


export class PostShieldInformationBarrierSegmentMembersRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: shared.ShieldInformationBarrierBase;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier_segment" })
  shieldInformationBarrierSegment: PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user: shared.UserBase;
}


export class PostShieldInformationBarrierSegmentMembersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostShieldInformationBarrierSegmentMembersRequestBody;
}


export class PostShieldInformationBarrierSegmentMembersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegmentMember?: shared.ShieldInformationBarrierSegmentMember;

  @SpeakeasyMetadata()
  statusCode: number;
}
