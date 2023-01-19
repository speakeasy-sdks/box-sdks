import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { EnterpriseBase } from "./enterprisebase";


export enum ShieldInformationBarrierStatusEnum {
    Draft = "draft",
    Pending = "pending",
    Disabled = "disabled",
    Enabled = "enabled",
    Invalid = "invalid"
}

export enum ShieldInformationBarrierTypeEnum {
    ShieldInformationBarrier = "shield_information_barrier"
}


// ShieldInformationBarrier
/** 
 * A standard representation of a
 * shield information barrier object
**/
export class ShieldInformationBarrier extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=enabled_at" })
  enabledAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=enabled_by" })
  enabledBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: EnterpriseBase;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: ShieldInformationBarrierStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=updated_by" })
  updatedBy?: UserBase;
}
