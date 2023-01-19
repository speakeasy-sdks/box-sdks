import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { RetentionPolicyMini } from "./retentionpolicymini";



// RetentionPolicies
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class RetentionPolicies extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: RetentionPolicyMini })
  entries?: RetentionPolicyMini[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: string;
}
