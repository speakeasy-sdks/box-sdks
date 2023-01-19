import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileVersionLegalHold } from "./fileversionlegalhold";



// FileVersionLegalHolds
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class FileVersionLegalHolds extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FileVersionLegalHold })
  entries?: FileVersionLegalHold[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
