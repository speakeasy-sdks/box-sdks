import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostOauth2RevokeServerList = [
	"https://api.box.com",
] as const;


export class PostOauth2RevokeRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata({ data: "request, media_type=application/x-www-form-urlencoded" })
  request?: shared.PostOAuth2Revoke;
}


export class PostOauth2RevokeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  oAuth2Error?: shared.OAuth2Error;

  @SpeakeasyMetadata()
  statusCode: number;
}
