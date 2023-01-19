import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PostOAuth2TokenRefreshAccessTokenGrantTypeEnum {
    RefreshToken = "refresh_token"
}


// PostOAuth2TokenRefreshAccessToken
/** 
 * A request to refresh an Access Token. Use this API to refresh an expired
 * Access Token using a valid Refresh Token.
**/
export class PostOAuth2TokenRefreshAccessToken extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "form, name=client_id;" })
  clientId: string;

  @SpeakeasyMetadata({ data: "form, name=client_secret;" })
  clientSecret: string;

  @SpeakeasyMetadata({ data: "form, name=grant_type;" })
  grantType: PostOAuth2TokenRefreshAccessTokenGrantTypeEnum;

  @SpeakeasyMetadata({ data: "form, name=refresh_token;" })
  refreshToken: string;
}
