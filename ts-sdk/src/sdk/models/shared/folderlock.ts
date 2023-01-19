import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";
import { FolderMini } from "./foldermini";



// FolderLockLockedOperations
/** 
 * The operations that have been locked. Currently the `move`
 * and `delete` operations cannot be locked separately, and both need to be
 * set to `true`.
 * 
**/
export class FolderLockLockedOperations extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=delete" })
  delete: boolean;

  @SpeakeasyMetadata({ data: "json, name=move" })
  move: boolean;
}


// FolderLock
/** 
 * Folder locks define access restrictions placed by folder owners
 * to prevent specific folders from being moved or deleted.
**/
export class FolderLock extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder?: FolderMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=lock_type" })
  lockType?: string;

  @SpeakeasyMetadata({ data: "json, name=locked_operations" })
  lockedOperations?: FolderLockLockedOperations;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}
