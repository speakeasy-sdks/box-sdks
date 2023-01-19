import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { SignRequestOutput } from "./signrequest";



// SignRequestsOutput
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class SignRequestsOutput extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: SignRequestOutput })
  entries?: SignRequestOutput[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
