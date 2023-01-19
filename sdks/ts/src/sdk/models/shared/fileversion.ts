import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";


export enum FileVersionTypeEnum {
    FileVersion = "file_version"
}


// FileVersion
/** 
 * The bare basic representation of a file version, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class FileVersion extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=restored_at" })
  restoredAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=restored_by" })
  restoredBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size?: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=trashed_by" })
  trashedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileVersionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=uploader_display_name" })
  uploaderDisplayName?: string;
}
