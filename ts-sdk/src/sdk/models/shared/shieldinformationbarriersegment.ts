import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { ShieldInformationBarrierBase } from "./shieldinformationbarrierbase";


export enum ShieldInformationBarrierSegmentTypeEnum {
    ShieldInformationBarrierSegment = "shield_information_barrier_segment"
}


// ShieldInformationBarrierSegment
/** 
 * A shield information barrier segment object
**/
export class ShieldInformationBarrierSegment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: ShieldInformationBarrierBase;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierSegmentTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=updated_by" })
  updatedBy?: UserBase;
}
