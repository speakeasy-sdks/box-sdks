import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { ShieldInformationBarrierBase } from "./shieldinformationbarrierbase";


export enum ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment
/** 
 * The `type` and `id` of the requested
 * shield information barrier segment.
**/
export class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum;
}

export enum ShieldInformationBarrierSegmentMemberTypeEnum {
    ShieldInformationBarrierSegmentMember = "shield_information_barrier_segment_member"
}


// ShieldInformationBarrierSegmentMember
/** 
 * A base representation of a
 * shield information barrier segment member object
**/
export class ShieldInformationBarrierSegmentMember extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: ShieldInformationBarrierBase;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier_segment" })
  shieldInformationBarrierSegment?: ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentMemberTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=updated_by" })
  updatedBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user?: UserBase;
}
