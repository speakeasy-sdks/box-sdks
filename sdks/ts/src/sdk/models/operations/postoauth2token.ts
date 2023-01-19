import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostOauth2TokenServerList = [
	"https://api.box.com",
] as const;


export class PostOauth2TokenRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata({ data: "request, media_type=application/x-www-form-urlencoded" })
  request?: shared.PostOAuth2Token;
}


export class PostOauth2TokenResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  accessToken?: shared.AccessToken;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  oAuth2Error?: shared.OAuth2Error;

  @SpeakeasyMetadata()
  statusCode: number;
}
