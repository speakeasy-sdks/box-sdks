import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";
import { UserMini } from "./usermini";


export enum TrashWebLinkRestoredItemStatusEnum {
    Active = "active",
    Trashed = "trashed",
    Deleted = "deleted"
}


// TrashWebLinkRestoredPathCollection
/** 
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
export class TrashWebLinkRestoredPathCollection extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderMini })
  entries: FolderMini[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount: number;
}

export enum TrashWebLinkRestoredTypeEnum {
    WebLink = "web_link"
}


// TrashWebLinkRestored
/** 
 * Represents a web link restored from the trash.
**/
export class TrashWebLinkRestored extends SpeakeasyBase {
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
  itemStatus?: TrashWebLinkRestoredItemStatusEnum;

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
  pathCollection: TrashWebLinkRestoredPathCollection;

  @SpeakeasyMetadata({ data: "json, name=purged_at" })
  purgedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=trashed_at" })
  trashedAt?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrashWebLinkRestoredTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
