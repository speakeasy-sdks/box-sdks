import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";
import { UserMini } from "./usermini";
import { FileVersionMini } from "./fileversionmini";


export enum TrashFileRestoredItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum TrashFileRestoredUserBaseTypeEnum {
    User = "user"
}


// TrashFileRestoredUserBase
/** 
 * The user who last modified this file
**/
export class TrashFileRestoredUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileRestoredUserBaseTypeEnum;
}

export enum TrashFileRestoredFolderBaseTypeEnum {
    Folder = "folder"
}


// TrashFileRestoredFolderBase
/** 
 * The folder that this file is located within.
**/
export class TrashFileRestoredFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileRestoredFolderBaseTypeEnum;
}


// TrashFileRestoredPathCollection
/** 
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
export class TrashFileRestoredPathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashFileRestoredTypeEnum {
    File = "file"
}


// TrashFileRestored
/** 
 * Represents a file restored from the trash.
**/
export class TrashFileRestored extends SpeakeasyBase {
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
  itemStatus: TrashFileRestoredItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy: TrashFileRestoredUserBase;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy: TrashFileRestoredUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: TrashFileRestoredFolderBase;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection: TrashFileRestoredPathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1: string;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size: number;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TrashFileRestoredTypeEnum;
}
