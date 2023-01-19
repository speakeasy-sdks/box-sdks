import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileVersionMini } from "./fileversionmini";


export enum FileConflictTypeEnum {
    File = "file"
}


// FileConflict
/** 
 * The bare basic representation of a file, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class FileConflict extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: FileVersionMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileConflictTypeEnum;
}
