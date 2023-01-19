import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { ShieldInformationBarrierBase } from "./shieldinformationbarrierbase";



// ShieldInformationBarrierReference
/** 
 * A shield information barrier reference for requests and responses
**/
export class ShieldInformationBarrierReference extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shield_information_barrier" })
  shieldInformationBarrier?: ShieldInformationBarrierBase;
}
