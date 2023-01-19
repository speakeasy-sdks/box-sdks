import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { LegalHoldPolicyAssignmentBase } from "./legalholdpolicyassignmentbase";



// LegalHoldPolicyAssignments
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class LegalHoldPolicyAssignments extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: LegalHoldPolicyAssignmentBase })
  entries?: LegalHoldPolicyAssignmentBase[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
