import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { CollaborationAllowlistEntry } from "./collaborationallowlistentry";



// CollaborationAllowlistEntries
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class CollaborationAllowlistEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: CollaborationAllowlistEntry })
  entries?: CollaborationAllowlistEntry[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
