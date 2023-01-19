import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { StoragePolicyAssignment } from "./storagepolicyassignment";



// StoragePolicyAssignments
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class StoragePolicyAssignments extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: StoragePolicyAssignment })
  entries?: StoragePolicyAssignment[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
