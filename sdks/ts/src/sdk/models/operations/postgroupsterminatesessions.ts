import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostGroupsTerminateSessionsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=group_ids" })
  groupIds: string[];
}


export class PostGroupsTerminateSessionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostGroupsTerminateSessionsRequestBody;
}


export class PostGroupsTerminateSessionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  sessionTerminationMessage?: shared.SessionTerminationMessage;

  @SpeakeasyMetadata()
  statusCode: number;
}
