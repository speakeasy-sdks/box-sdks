import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { RetentionPolicyMini } from "./retentionpolicymini";


export enum RetentionPolicyAssignmentAssignedToTypeEnum {
    Folder = "folder",
    Enterprise = "enterprise",
    MetadataTemplate = "metadata_template"
}


// RetentionPolicyAssignmentAssignedTo
/** 
 * The `type` and `id` of the content that is under
 * retention. The `type` can either be `folder`
 * `enterprise`, or `metadata_template`.
**/
export class RetentionPolicyAssignmentAssignedTo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: RetentionPolicyAssignmentAssignedToTypeEnum;
}


export class RetentionPolicyAssignmentFilterFields extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=field" })
  field?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}

export enum RetentionPolicyAssignmentTypeEnum {
    RetentionPolicyAssignment = "retention_policy_assignment"
}


// RetentionPolicyAssignment
/** 
 * A retention assignment represents a rule specifying
 * the files a retention policy retains.
 * Assignments can retain files based on their folder or metadata,
 * or hold all files in the enterprise.
**/
export class RetentionPolicyAssignment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assigned_at" })
  assignedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=assigned_by" })
  assignedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=assigned_to" })
  assignedTo?: RetentionPolicyAssignmentAssignedTo;

  @SpeakeasyMetadata({ data: "json, name=filter_fields", elemType: RetentionPolicyAssignmentFilterFields })
  filterFields?: RetentionPolicyAssignmentFilterFields[];

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_policy" })
  retentionPolicy?: RetentionPolicyMini;

  @SpeakeasyMetadata({ data: "json, name=start_date_field" })
  startDateField?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: RetentionPolicyAssignmentTypeEnum;
}
