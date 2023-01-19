import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum FileVersionMiniTypeEnum {
    FileVersion = "file_version"
}


// FileVersionMini
/** 
 * The bare basic representation of a file version, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class FileVersionMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileVersionMiniTypeEnum;
}
