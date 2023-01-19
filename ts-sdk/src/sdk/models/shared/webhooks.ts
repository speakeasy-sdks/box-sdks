import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { WebhookMini } from "./webhookmini";



// Webhooks
/** 
 * The part of an API response that describes marker
 * based pagination
**/
export class Webhooks extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: WebhookMini })
  entries?: WebhookMini[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=next_marker" })
  nextMarker?: number;

  @SpeakeasyMetadata({ data: "json, name=prev_marker" })
  prevMarker?: number;
}
