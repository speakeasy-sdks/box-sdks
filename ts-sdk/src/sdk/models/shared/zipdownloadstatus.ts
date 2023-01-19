import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ZipDownloadStatusStateEnum {
    InProgress = "in_progress",
    Failed = "failed",
    Success = "success"
}


// ZipDownloadStatus
/** 
 * The status of a `zip` archive being downloaded.
**/
export class ZipDownloadStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=downloaded_file_count" })
  downloadedFileCount?: number;

  @SpeakeasyMetadata({ data: "json, name=skipped_file_count" })
  skippedFileCount?: number;

  @SpeakeasyMetadata({ data: "json, name=skipped_folder_count" })
  skippedFolderCount?: number;

  @SpeakeasyMetadata({ data: "json, name=state" })
  state?: ZipDownloadStatusStateEnum;

  @SpeakeasyMetadata({ data: "json, name=total_file_count" })
  totalFileCount?: number;
}
