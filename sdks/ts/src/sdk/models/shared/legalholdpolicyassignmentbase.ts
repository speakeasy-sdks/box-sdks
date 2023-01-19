import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum LegalHoldPolicyAssignmentBaseTypeEnum {
    LegalHoldPolicyAssignment = "legal_hold_policy_assignment"
}


// LegalHoldPolicyAssignmentBase
/** 
 * Legal Hold Assignments are used to assign Legal Hold
 * Policies to Users, Folders, Files, or File Versions.
 * 
 * Creating a Legal Hold Assignment puts a hold
 * on the File-Versions that belong to the Assignment's
 * 'apply-to' entity.
**/
export class LegalHoldPolicyAssignmentBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: LegalHoldPolicyAssignmentBaseTypeEnum;
}
