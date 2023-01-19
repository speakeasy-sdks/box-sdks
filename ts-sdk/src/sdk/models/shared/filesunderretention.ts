import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";



// FilesUnderRetention
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class FilesUnderRetention extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FileMini })
  entries?: FileMini[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
