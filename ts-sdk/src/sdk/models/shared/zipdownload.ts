import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ZipDownloadNameConflictsTypeEnum {
    File = "file",
    Folder = "folder"
}


// ZipDownloadNameConflicts
/** 
 * A file or folder for which a conflict was encountered, This object provides the type and identifier of the original item, as well as a mapping between its original name and it's new name as it will appear in the archive.
**/
export class ZipDownloadNameConflicts extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=download_name" })
  downloadName?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=original_name" })
  originalName?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ZipDownloadNameConflictsTypeEnum;
}


// ZipDownload
/** 
 * Represents a successful request to create a `zip` archive of a list of files
 * and folders.
**/
export class ZipDownload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=download_url" })
  downloadUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=name_conflicts", elemType: ZipDownloadNameConflicts, elemDepth: 2 })
  nameConflicts?: ZipDownloadNameConflicts[][];

  @SpeakeasyMetadata({ data: "json, name=status_url" })
  statusUrl?: string;
}
