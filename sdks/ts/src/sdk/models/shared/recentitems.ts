import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { RecentItem } from "./recentitem";



// RecentItems
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class RecentItems extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: RecentItem })
  entries?: RecentItem[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
