import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostUsersTerminateSessionsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=user_ids" })
  userIds: string[];

  @SpeakeasyMetadata({ data: "json, name=user_logins" })
  userLogins: string[];
}


export class PostUsersTerminateSessionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostUsersTerminateSessionsRequestBody;
}


export class PostUsersTerminateSessionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  sessionTerminationMessage?: shared.SessionTerminationMessage;

  @SpeakeasyMetadata()
  statusCode: number;
}
