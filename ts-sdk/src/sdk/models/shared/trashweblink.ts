import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";
import { FolderMini } from "./foldermini";


export enum TrashWebLinkItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}

export enum TrashWebLinkPathCollectionTrashEntriesTypeEnum {
    Folder = "folder"
}


// TrashWebLinkPathCollectionTrashEntries
/** 
 * The parent folder for this item
**/
export class TrashWebLinkPathCollectionTrashEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashWebLinkPathCollectionTrashEntriesTypeEnum;
}


// TrashWebLinkPathCollectionTrash
/** 
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
export class TrashWebLinkPathCollectionTrash extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TrashWebLinkPathCollectionTrashEntries })
  entries: TrashWebLinkPathCollectionTrashEntries[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashWebLinkTypeEnum {
    WebLink = "web_link"
}


// TrashWebLink
/** 
 * Represents a trashed web link.
**/
export class TrashWebLink extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=item_status" })
  itemStatus?: TrashWebLinkItemStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_by" })
  modifiedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: FolderMini;

  @SpeakeasyMetadata({ data: "json, name=path_collection" })
  pathCollection?: TrashWebLinkPathCollectionTrash;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashWebLinkTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
