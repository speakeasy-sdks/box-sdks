import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum TrashFolderUserBaseTypeEnum {
    User = "user"
}


// TrashFolderUserBase
/** 
 * The user who created this folder
**/
export class TrashFolderUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFolderUserBaseTypeEnum;
}

export enum TrashFolderItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum TrashFolderFolderBaseTypeEnum {
    Folder = "folder"
}


// TrashFolderFolderBase
/** 
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
export class TrashFolderFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFolderFolderBaseTypeEnum;
}

export enum TrashFolderPathCollectionTrashEntriesTypeEnum {
    Folder = "folder"
}


// TrashFolderPathCollectionTrashEntries
/** 
 * The parent folder for this item
**/
export class TrashFolderPathCollectionTrashEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashFolderPathCollectionTrashEntriesTypeEnum;
}


// TrashFolderPathCollectionTrash
/** 
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
export class TrashFolderPathCollectionTrash extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TrashFolderPathCollectionTrashEntries })
  entries: TrashFolderPathCollectionTrashEntries[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashFolderTypeEnum {
    Folder = "folder"
}


// TrashFolder
/** 
 * Represents a trashed folder.
**/
export class TrashFolder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy: TrashFolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=folder_upload_email" })
  folderUploadEmail?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus: TrashFolderItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy: TrashFolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: TrashFolderUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: TrashFolderFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection: TrashFolderPathCollectionTrash;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFolderTypeEnum;
}
