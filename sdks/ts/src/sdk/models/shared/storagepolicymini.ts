import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum StoragePolicyMiniTypeEnum {
    StoragePolicy = "storage_policy"
}


// StoragePolicyMini
/** 
 * A mini description of a Storage Policy object
**/
export class StoragePolicyMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: StoragePolicyMiniTypeEnum;
}
