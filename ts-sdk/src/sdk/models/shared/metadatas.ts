import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Metadata } from "./metadata";



// Metadatas
/** 
 * A list of metadata instances that have been applied to a file or folder.
**/
export class Metadatas extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Metadata })
  entries?: Metadata[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;
}
