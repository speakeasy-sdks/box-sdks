import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { ShieldInformationBarrierReportDetails } from "./shieldinformationbarrierreportdetails";
import { ShieldInformationBarrierReference } from "./shieldinformationbarrierreference";


export enum ShieldInformationBarrierReportStatusEnum {
    Pending = "pending",
    Error = "error",
    Done = "done",
    Cancelled = "cancelled"
}

export enum ShieldInformationBarrierReportTypeEnum {
    ShieldInformationBarrierReport = "shield_information_barrier_report"
}


// ShieldInformationBarrierReport
/** 
 * A base representation of a
 * shield information barrier report object
**/
export class ShieldInformationBarrierReport extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=details" })
  details?: ShieldInformationBarrierReportDetails;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: ShieldInformationBarrierReference;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: ShieldInformationBarrierReportStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierReportTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt?: Date;
}
