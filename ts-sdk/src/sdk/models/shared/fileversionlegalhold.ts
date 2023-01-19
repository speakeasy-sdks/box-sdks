import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";
import { FileVersionMini } from "./fileversionmini";
import { LegalHoldPolicyAssignment } from "./legalholdpolicyassignment";


export enum FileVersionLegalHoldTypeEnum {
    FileVersionLegalHold = "file_version_legal_hold"
}


// FileVersionLegalHold
/** 
 * File-Version-Legal-Hold is an entity representing all
 * holds on a File Version.
**/
export class FileVersionLegalHold extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=deleted_at" })
  deletedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=file" })
  file?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: FileVersionMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=legal_hold_policy_assignments", elemType: LegalHoldPolicyAssignment })
  legalHoldPolicyAssignments?: LegalHoldPolicyAssignment[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: FileVersionLegalHoldTypeEnum;
}
