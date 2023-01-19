import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum RetentionPolicyMiniDispositionActionEnum {
    PermanentlyDelete = "permanently_delete",
    RemoveRetention = "remove_retention"
}

export enum RetentionPolicyMiniTypeEnum {
    RetentionPolicy = "retention_policy"
}


// RetentionPolicyMini
/** 
 * A base representation of a retention policy.
**/
export class RetentionPolicyMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=disposition_action" })
  dispositionAction?: RetentionPolicyMiniDispositionActionEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_length" })
  retentionLength?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: RetentionPolicyMiniTypeEnum;
}
