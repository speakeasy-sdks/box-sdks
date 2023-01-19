import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { MetadataCascadePolicy } from "./metadatacascadepolicy";



// MetadataCascadePolicies
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class MetadataCascadePolicies extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: MetadataCascadePolicy })
  entries?: MetadataCascadePolicy[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
