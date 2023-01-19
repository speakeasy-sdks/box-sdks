import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { FileVersionMini } from "./fileversionmini";


export enum TrashFileItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum TrashFileUserBaseTypeEnum {
    User = "user"
}


// TrashFileUserBase
/** 
 * The user who last modified this file
**/
export class TrashFileUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileUserBaseTypeEnum;
}

export enum TrashFileFolderBaseTypeEnum {
    Folder = "folder"
}


// TrashFileFolderBase
/** 
 * The folder that this file is located within.
**/
export class TrashFileFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileFolderBaseTypeEnum;
}

export enum TrashFilePathCollectionTrashEntriesTypeEnum {
    Folder = "folder"
}


// TrashFilePathCollectionTrashEntries
/** 
 * The parent folder for this item
**/
export class TrashFilePathCollectionTrashEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashFilePathCollectionTrashEntriesTypeEnum;
}


// TrashFilePathCollectionTrash
/** 
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
export class TrashFilePathCollectionTrash extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TrashFilePathCollectionTrashEntries })
  entries: TrashFilePathCollectionTrashEntries[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashFileTypeEnum {
    File = "file"
}


// TrashFile
/** 
 * Represents a trashed file.
**/
export class TrashFile extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description: string;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: FileVersionMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus: TrashFileItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy: TrashFileUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: TrashFileUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: TrashFileFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection: TrashFilePathCollectionTrash;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1: string;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileTypeEnum;
}
