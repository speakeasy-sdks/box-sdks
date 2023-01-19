import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum StoragePolicyTypeEnum {
    StoragePolicy = "storage_policy"
}


// StoragePolicy
/** 
 * A mini description of a Storage Policy object
**/
export class StoragePolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: StoragePolicyTypeEnum;
}
