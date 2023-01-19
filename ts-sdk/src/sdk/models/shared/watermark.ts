import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class WatermarkWatermark extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;
}


// Watermark
/** 
 * A watermark is a semi-transparent overlay on an embedded file
 * preview that displays a viewer's email address or user ID
 * and the time of access over a file's content
**/
export class Watermark extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=watermark" })
  watermark?: WatermarkWatermark;
}
