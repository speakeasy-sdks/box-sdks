import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment
/** 
 * The `type` and `id` of the restricted
 * shield information barrier segment.
**/
export class PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum;
}

export enum PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment
/** 
 * The `type` and `id` of the requested
 * shield information barrier segment.
**/
export class PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum;
}

export enum PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum {
    ShieldInformationBarrierSegmentRestriction = "shield_information_barrier_segment_restriction"
}


export class PostShieldInformationBarrierSegmentRestrictionsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=restricted_segment" })
  restrictedSegment: PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: shared.ShieldInformationBarrierBase;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier_segment" })
  shieldInformationBarrierSegment: PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum;
}


export class PostShieldInformationBarrierSegmentRestrictionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostShieldInformationBarrierSegmentRestrictionsRequestBody;
}


export class PostShieldInformationBarrierSegmentRestrictionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrierSegmentRestriction?: shared.ShieldInformationBarrierSegmentRestriction;

  @SpeakeasyMetadata()
  statusCode: number;
}
