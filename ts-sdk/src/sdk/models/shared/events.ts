import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Event } from "./event";



// Events
/** 
 * A list of event objects
**/
export class Events extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=chunk_size" })
  chunkSize?: number;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Event })
  entries?: Event[];

  @SpeakeasyMetadata({ data: "json, name=next_stream_position" })
  nextStreamPosition?: string;
}
