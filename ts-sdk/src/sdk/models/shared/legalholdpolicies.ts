import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { LegalHoldPolicy } from "./legalholdpolicy";



// LegalHoldPolicies
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class LegalHoldPolicies extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: LegalHoldPolicy })
  entries?: LegalHoldPolicy[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
