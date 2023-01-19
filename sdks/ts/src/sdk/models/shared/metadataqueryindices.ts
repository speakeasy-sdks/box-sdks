import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { MetadataQueryIndex } from "./metadataqueryindex";



// MetadataQueryIndices
/** 
 * A collection of metadata query indices.
**/
export class MetadataQueryIndices extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: MetadataQueryIndex })
  entries?: MetadataQueryIndex[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}
