import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { RealtimeServer } from "./realtimeserver";



// RealtimeServers
/** 
 * A list of real-time servers that can
 * be used for long-polling.
**/
export class RealtimeServers extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=chunk_size" })
  chunkSize?: number;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: RealtimeServer })
  entries?: RealtimeServer[];
}
