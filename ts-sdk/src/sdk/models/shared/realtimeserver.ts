import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// RealtimeServer
/** 
 * A real-time server that can be used for
 * long polling user events
**/
export class RealtimeServer extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=max_retries" })
  maxRetries?: number;

  @SpeakeasyMetadata({ data: "json, name=retry_timeout" })
  retryTimeout?: number;

  @SpeakeasyMetadata({ data: "json, name=ttl" })
  ttl?: number;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url?: string;
}
