import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum FolderMiniTypeEnum {
    Folder = "folder"
}


// FolderMini
/** 
 * The bare basic representation of a folder, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
export class FolderMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FolderMiniTypeEnum;
}
