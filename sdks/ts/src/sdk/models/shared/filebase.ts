import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum FileBaseTypeEnum {
    File = "file"
}


// FileBase
/** 
 * The bare basic representation of a file, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class FileBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileBaseTypeEnum;
}
