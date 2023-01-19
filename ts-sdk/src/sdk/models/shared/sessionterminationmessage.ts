import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SessionTerminationMessage
/** 
 * A message informing about the
 * termination job status
**/
export class SessionTerminationMessage extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}
