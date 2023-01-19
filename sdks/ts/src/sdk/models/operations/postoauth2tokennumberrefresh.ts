import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostOauth2TokenNumberRefreshServerList = [
	"https://api.box.com",
] as const;


export class PostOauth2TokenNumberRefreshRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata({ data: "request, media_type=application/x-www-form-urlencoded" })
  request?: shared.PostOAuth2TokenRefreshAccessToken;
}


export class PostOauth2TokenNumberRefreshResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  accessToken?: shared.AccessToken;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  oAuth2Error?: shared.OAuth2Error;

  @SpeakeasyMetadata()
  statusCode: number;
}
