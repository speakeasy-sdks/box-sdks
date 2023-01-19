import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";


export enum DevicePinnerTypeEnum {
    DevicePinner = "device_pinner"
}


// DevicePinner
/** 
 * Device pins allow enterprises to control what devices can
 * use native Box applications.
**/
export class DevicePinner extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=product_name" })
  productName?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: DevicePinnerTypeEnum;
}
