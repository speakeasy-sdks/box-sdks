import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { DevicePinner } from "./devicepinner";


export enum DevicePinnersOrderByEnum {
    Id = "id"
}

export enum DevicePinnersOrderDirectionEnum {
    Asc = "asc",
    Desc = "desc"
}


// DevicePinnersOrder
/** 
 * The order in which a pagination is ordered
**/
export class DevicePinnersOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: DevicePinnersOrderByEnum;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: DevicePinnersOrderDirectionEnum;
}


// DevicePinners
/** 
 * A list of device pins
**/
export class DevicePinners extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: DevicePinner })
  entries?: DevicePinner[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: DevicePinnersOrder })
  order?: DevicePinnersOrder[];
}
