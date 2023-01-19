import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderLock } from "./folderlock";



// FolderLocks
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class FolderLocks extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FolderLock })
  entries?: FolderLock[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
