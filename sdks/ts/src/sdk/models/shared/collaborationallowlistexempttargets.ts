import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { CollaborationAllowlistExemptTarget } from "./collaborationallowlistexempttarget";



// CollaborationAllowlistExemptTargets
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class CollaborationAllowlistExemptTargets extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: CollaborationAllowlistExemptTarget })
  entries?: CollaborationAllowlistExemptTarget[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
