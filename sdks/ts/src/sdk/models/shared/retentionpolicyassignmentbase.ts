import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum RetentionPolicyAssignmentBaseTypeEnum {
    RetentionPolicyAssignment = "retention_policy_assignment"
}


// RetentionPolicyAssignmentBase
/** 
 * A base representation of a retention policy assignment.
**/
export class RetentionPolicyAssignmentBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: RetentionPolicyAssignmentBaseTypeEnum;
}
