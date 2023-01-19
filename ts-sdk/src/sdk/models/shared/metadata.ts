import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// Metadata
/** 
 * The base representation of a metadata instance.
**/
export class Metadata extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=$parent" })
  dollarParent?: string;

  @SpeakeasyMetadata({ data: "json, name=$scope" })
  dollarScope?: string;

  @SpeakeasyMetadata({ data: "json, name=$template" })
  dollarTemplate?: string;

  @SpeakeasyMetadata({ data: "json, name=$version" })
  dollarVersion?: number;
}
