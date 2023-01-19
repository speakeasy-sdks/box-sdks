import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { StoragePolicyMini } from "./storagepolicymini";



// StoragePolicyAssignmentReference
/** 
 * The bare basic reference for an object
**/
export class StoragePolicyAssignmentReference extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}


// StoragePolicyAssignment
/** 
 * The assignment of a storage policy to a user or enterprise
**/
export class StoragePolicyAssignment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assigned_to" })
  assignedTo?: StoragePolicyAssignmentReference;

  @SpeakeasyMetadata({ data: "json, name=storage_policy" })
  storagePolicy?: StoragePolicyMini;
}
