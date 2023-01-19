import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum TrackingCodeTypeEnum {
    TrackingCode = "tracking_code"
}


// TrackingCode
/** 
 * Tracking codes allow an admin to generate reports from the admin console
 * and assign an attribute to a specific group of users.
 * This setting must be enabled for an enterprise before it can be used.
**/
export class TrackingCode extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TrackingCodeTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}
