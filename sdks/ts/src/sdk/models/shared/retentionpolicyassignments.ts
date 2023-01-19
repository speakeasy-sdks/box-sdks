import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { RetentionPolicyAssignmentBase } from "./retentionpolicyassignmentbase";



// RetentionPolicyAssignments
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class RetentionPolicyAssignments extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: RetentionPolicyAssignmentBase })
  entries?: RetentionPolicyAssignmentBase[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}
