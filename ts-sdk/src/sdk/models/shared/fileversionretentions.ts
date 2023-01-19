import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileVersionRetention } from "./fileversionretention";



// FileVersionRetentions
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class FileVersionRetentions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FileVersionRetention })
  entries?: FileVersionRetention[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
