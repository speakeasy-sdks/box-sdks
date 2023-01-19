import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";



// RetentionPolicyAssignmentCounts
/** 
 * Counts the retention policy assignments for each item type.
**/
export class RetentionPolicyAssignmentCounts extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: number;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder?: number;

  @SpeakeasyMetadata({ data: "json, name=metadata_template" })
  metadataTemplate?: number;
}

export enum RetentionPolicyDispositionActionEnum {
    PermanentlyDelete = "permanently_delete",
    RemoveRetention = "remove_retention"
}

export enum RetentionPolicyPolicyTypeEnum {
    Finite = "finite",
    Indefinite = "indefinite"
}

export enum RetentionPolicyRetentionTypeEnum {
    Modifiable = "modifiable",
    NonModifiable = "non-modifiable"
}

export enum RetentionPolicyStatusEnum {
    Active = "active",
    Retired = "retired"
}

export enum RetentionPolicyTypeEnum {
    RetentionPolicy = "retention_policy"
}


// RetentionPolicy
/** 
 * A base representation of a retention policy.
**/
export class RetentionPolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=are_owners_notified" })
  areOwnersNotified?: boolean;

  @SpeakeasyMetadata({ data: "json, name=assignment_counts" })
  assignmentCounts?: RetentionPolicyAssignmentCounts;

  @SpeakeasyMetadata({ data: "json, name=can_owner_extend_retention" })
  canOwnerExtendRetention?: boolean;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=custom_notification_recipients", elemType: UserMini })
  customNotificationRecipients?: UserMini[];

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=disposition_action" })
  dispositionAction?: RetentionPolicyDispositionActionEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "json, name=policy_type" })
  policyType?: RetentionPolicyPolicyTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=retention_length" })
  retentionLength?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_type" })
  retentionType?: RetentionPolicyRetentionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: RetentionPolicyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: RetentionPolicyTypeEnum;
}
