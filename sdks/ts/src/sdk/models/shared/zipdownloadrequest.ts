import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ZipDownloadRequestItemsTypeEnum {
    File = "file",
    Folder = "folder."
}


// ZipDownloadRequestItems
/** 
 * An item to add to the `zip` archive. This can be a file or a folder.
**/
export class ZipDownloadRequestItems extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: ZipDownloadRequestItemsTypeEnum;
}


// ZipDownloadRequest
/** 
 * A request to create a `zip` archive to download
**/
export class ZipDownloadRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=download_file_name" })
  downloadFileName?: string;

  @SpeakeasyMetadata({ data: "json, name=items", elemType: ZipDownloadRequestItems })
  items: ZipDownloadRequestItems[];
}
