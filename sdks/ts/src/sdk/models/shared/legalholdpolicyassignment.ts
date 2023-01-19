import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { File } from "./file";
import { Folder } from "./folder";
import { WebLink } from "./weblink";
import { LegalHoldPolicyMini } from "./legalholdpolicymini";


export enum LegalHoldPolicyAssignmentTypeEnum {
    LegalHoldPolicyAssignment = "legal_hold_policy_assignment"
}


// LegalHoldPolicyAssignment
/** 
 * Legal Hold Assignments are used to assign Legal Hold
 * Policies to Users, Folders, Files, or File Versions.
 * 
 * Creating a Legal Hold Assignment puts a hold
 * on the File-Versions that belong to the Assignment's
 * 'apply-to' entity.
**/
export class LegalHoldPolicyAssignment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assigned_at" })
  assignedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=assigned_by" })
  assignedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=assigned_to" })
  assignedTo?: any;

  @SpeakeasyMetadata({ data: "json, name=deleted_at" })
  deletedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=legal_hold_policy" })
  legalHoldPolicy?: LegalHoldPolicyMini;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: LegalHoldPolicyAssignmentTypeEnum;
}
