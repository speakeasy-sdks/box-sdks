import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum LegalHoldPolicyMiniTypeEnum {
    LegalHoldPolicy = "legal_hold_policy"
}


// LegalHoldPolicyMini
/** 
 * A mini legal hold policy
**/
export class LegalHoldPolicyMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: LegalHoldPolicyMiniTypeEnum;
}
