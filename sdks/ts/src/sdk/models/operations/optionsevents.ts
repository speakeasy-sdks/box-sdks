import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class OptionsEventsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;
}


export class OptionsEventsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  realtimeServers?: shared.RealtimeServers;

  @SpeakeasyMetadata()
  statusCode: number;
}
