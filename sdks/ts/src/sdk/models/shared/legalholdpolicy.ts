import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";



// LegalHoldPolicyAssignmentCounts
/** 
 * Counts of assignments within this a legal hold policy by item type
**/
export class LegalHoldPolicyAssignmentCounts extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=file" })
  file?: number;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: number;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder?: number;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user?: number;
}

export enum LegalHoldPolicyStatusEnum {
    Active = "active",
    Applying = "applying",
    Releasing = "releasing",
    Released = "released"
}

export enum LegalHoldPolicyTypeEnum {
    LegalHoldPolicy = "legal_hold_policy"
}


// LegalHoldPolicy
/** 
 * A mini legal hold policy
**/
export class LegalHoldPolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assignment_counts" })
  assignmentCounts?: LegalHoldPolicyAssignmentCounts;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=deleted_at" })
  deletedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=filter_ended_at" })
  filterEndedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=filter_started_at" })
  filterStartedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "json, name=release_notes" })
  releaseNotes?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: LegalHoldPolicyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: LegalHoldPolicyTypeEnum;
}
