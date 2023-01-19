import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { MetadataTemplate } from "./metadatatemplate";



// MetadataTemplates
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class MetadataTemplates extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: MetadataTemplate })
  entries?: MetadataTemplate[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
