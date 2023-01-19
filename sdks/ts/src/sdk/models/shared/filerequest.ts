import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";


export enum FileRequestFolderBaseTypeEnum {
    Folder = "folder"
}


// FileRequestFolderBase
/** 
 * The folder that this file request is associated with.
 * 
 * Files submitted through the file request form will be
 * uploaded to this folder.
**/
export class FileRequestFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileRequestFolderBaseTypeEnum;
}

export enum FileRequestStatusEnum {
    Active = "active",
    Inactive = "inactive"
}

export enum FileRequestTypeEnum {
    FileRequest = "file_request"
}

export enum FileRequestUserBaseTypeEnum {
    User = "user"
}


// FileRequestUserBase
/** 
 * The user who last modified this file request.
**/
export class FileRequestUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: FileRequestUserBaseTypeEnum;
}


// FileRequest
/** 
 * A standard representation of a file request, as returned
 * from any file request API endpoints by default.
**/
export class FileRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder: FileRequestFolderBase;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=is_description_required" })
  isDescriptionRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_email_required" })
  isEmailRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: FileRequestStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: FileRequestTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=updated_at" })
  updatedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=updated_by" })
  updatedBy?: FileRequestUserBase;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
