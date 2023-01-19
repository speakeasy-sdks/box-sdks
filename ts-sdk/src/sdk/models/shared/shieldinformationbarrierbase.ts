import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ShieldInformationBarrierBaseTypeEnum {
    ShieldInformationBarrier = "shield_information_barrier"
}


// ShieldInformationBarrierBase
/** 
 * A base representation of a
 * shield information barrier object
**/
export class ShieldInformationBarrierBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ShieldInformationBarrierBaseTypeEnum;
}
