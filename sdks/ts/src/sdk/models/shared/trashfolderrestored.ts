import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";


export enum TrashFolderRestoredUserBaseTypeEnum {
    User = "user"
}


// TrashFolderRestoredUserBase
/** 
 * The user who created this folder
**/
export class TrashFolderRestoredUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFolderRestoredUserBaseTypeEnum;
}

export enum TrashFolderRestoredItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum TrashFolderRestoredFolderBaseTypeEnum {
    Folder = "folder"
}


// TrashFolderRestoredFolderBase
/** 
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
export class TrashFolderRestoredFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFolderRestoredFolderBaseTypeEnum;
}


// TrashFolderRestoredPathCollection
/** 
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
export class TrashFolderRestoredPathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashFolderRestoredTypeEnum {
    Folder = "folder"
}


// TrashFolderRestored
/** 
 * Represents a folder restored from the trash.
**/
export class TrashFolderRestored extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: TrashFolderRestoredUserBase;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=folder_upload_email" })
  folderUploadEmail?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus?: TrashFolderRestoredItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy?: TrashFolderRestoredUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy?: TrashFolderRestoredUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: TrashFolderRestoredFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection?: TrashFolderRestoredPathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size?: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashFolderRestoredTypeEnum;
}
