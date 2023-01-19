import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { ShieldInformationBarrierBase } from "./shieldinformationbarrierbase";


export enum ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// ShieldInformationBarrierSegmentRestrictionRestrictedSegment
/** 
 * The `type` and `id` of the
 * restricted shield information barrier segment.
**/
export class ShieldInformationBarrierSegmentRestrictionRestrictedSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum;
}

export enum ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment
/** 
 * The `type` and `id` of the
 * requested shield information barrier segment.
**/
export class ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum;
}

export enum ShieldInformationBarrierSegmentRestrictionTypeEnum {
    ShieldInformationBarrierSegmentRestriction = "shield_information_barrier_segment_restriction"
}


// ShieldInformationBarrierSegmentRestriction
/** 
 * A base representation of
 * a segment restriction object for
 * the shield information barrier
**/
export class ShieldInformationBarrierSegmentRestriction extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=restricted_segment" })
  restrictedSegment: ShieldInformationBarrierSegmentRestrictionRestrictedSegment;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: ShieldInformationBarrierBase;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier_segment" })
  shieldInformationBarrierSegment: ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentRestrictionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=updated_by" })
  updatedBy?: UserBase;
}
