import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum FileRequestCopyRequestFolderTypeEnum {
    Folder = "folder"
}


// FileRequestCopyRequestFolder
/** 
 * The folder to associate the new file request to.
**/
export class FileRequestCopyRequestFolder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: FileRequestCopyRequestFolderTypeEnum;
}

export enum FileRequestCopyRequestStatusEnum {
    Active = "active",
    Inactive = "inactive"
}


// FileRequestCopyRequest
/** 
 * The request body to update a file request.
**/
export class FileRequestCopyRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder: FileRequestCopyRequestFolder;

  @SpeakeasyMetadata({ data: "json, name=is_description_required" })
  isDescriptionRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_email_required" })
  isEmailRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: FileRequestCopyRequestStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title?: string;
}
