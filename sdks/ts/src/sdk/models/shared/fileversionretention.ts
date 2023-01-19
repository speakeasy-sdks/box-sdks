import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";
import { FileVersionMini } from "./fileversionmini";
import { RetentionPolicyMini } from "./retentionpolicymini";


export enum FileVersionRetentionTypeEnum {
    FileVersionRetention = "file_version_retention"
}


// FileVersionRetention
/** 
 * A retention policy blocks permanent deletion of content
 * for a specified amount of time. Admins can apply policies to
 * specified folders, or an entire enterprise. A file version retention
 * is a  record for a retained file version. To use this feature,
 * you must  have the manage retention policies scope enabled for your
 * API key via  your application management console. For more information
 * about retention policies, please visit our help documentation
**/
export class FileVersionRetention extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=applied_at" })
  appliedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=disposition_at" })
  dispositionAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=file" })
  file?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: FileVersionMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: FileVersionRetentionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=winning_retention_policy" })
  winningRetentionPolicy?: RetentionPolicyMini;
}
