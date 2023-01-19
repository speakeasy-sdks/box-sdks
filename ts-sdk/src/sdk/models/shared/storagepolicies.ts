import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { StoragePolicy } from "./storagepolicy";



// StoragePolicies
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class StoragePolicies extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: StoragePolicy })
  entries?: StoragePolicy[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
