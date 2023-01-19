import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Workflow } from "./workflow";



// Workflows
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class Workflows extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Workflow })
  entries?: Workflow[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
